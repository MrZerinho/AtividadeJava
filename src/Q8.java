import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;
        double x, y, resultado;

        do {
            exibirMenu();
            codigo = input.nextInt();

            if (codigo >= 1 && codigo <= 4) {
                System.out.print("Digite o valor de x: ");
                x = input.nextDouble();

                System.out.print("Digite o valor de y: ");
                y = input.nextDouble();

                resultado = calcularEquacao(codigo, x, y);

                if (!Double.isNaN(resultado)) {
                    System.out.println("f(x, y) = " + resultado);
                } else {
                    System.out.println("Erro: Operação inválida para os valores fornecidos.");
                }
            } else if (codigo != 0) {
                System.out.println("Código inválido. Digite novamente.");
            }
            System.out.println();
        } while (codigo != 0);

        input.close();
    }
    public static void exibirMenu() {
        System.out.println("Escolha uma equação:");
        System.out.println("1: f(x, y) = sqrt(x³ + (x(2y - x)) / y²)");
        System.out.println("2: f(x, y) = (sqrt(x³ + y³) + (x³ - y³)) / (x * y)");
        System.out.println("3: f(x, y) = 2x + sqrt(x * y)");
        System.out.println("4: f(x, y) = sin(x) + cos(y)");
        System.out.println("0: Sair");
        System.out.print("Digite o código da equação desejada: ");
    }

    public static double calcularEquacao(int codigo, double x, double y) {
        switch (codigo) {
            case 1:
                if (y == 0) {
                    return Double.NaN; 
                }
                return Math.sqrt(Math.pow(x, 3) + (x * (2 * y - x)) / Math.pow(y, 2));
            case 2:
                if (x == 0 || y == 0) {
                    return Double.NaN; 
                }
                return (Math.sqrt(Math.pow(x, 3) + Math.pow(y, 3)) + (Math.pow(x, 3) - Math.pow(y, 3))) / (x * y);
            case 3:
                if (x * y < 0) {
                    return Double.NaN; 
                }
                return 2 * x + Math.sqrt(x * y);
            case 4:
                return Math.sin(x) + Math.cos(y);
            default:
                return Double.NaN; 
        }
    }
}