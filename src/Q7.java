import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();
        System.out.print("Digite o código do cargo do funcionário: ");
        int codigo = scanner.nextInt();
        String cargo = "";
        double percentual = 0;

        switch (codigo) {
            case 1:
                cargo = "Escriturário";
                percentual = 0.5;
                break;
            case 2:
                cargo = "Secretário";
                percentual = 0.35;
                break;
            case 3:
                cargo = "Caixa";
                percentual = 0.2;
                break;
            case 4:
                cargo = "Gerente";
                percentual = 0.1;
                break;
            case 5:
                cargo = "Diretor";
                percentual = 0;
                break;
            default:
                System.out.println("Código inválido.");
                return;
        }

        double aumento = salario * percentual;
        double salarioFinal = salario + aumento;
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.printf("Aumento: R$ %.2f\n", aumento);
        System.out.printf("Salário com aumento: R$ %.2f\n", salarioFinal);
    }
}