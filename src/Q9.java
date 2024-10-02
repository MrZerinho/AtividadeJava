import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        int resultado = potencia(x, y);

        System.out.println(x + " elevado a " + y + " é igual a " + resultado);
    }

    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else if (expoente < 0) {
            return 1 / potencia(base, -expoente); 
        } else {
            int resultado = 1;
            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }
            return resultado;
        }
    }
}