import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double SALARIO_MINIMO = 788.00;
        final double VALOR_HORA_EXTRA = 10.00;

        System.out.print("Informe a matrícula do funcionário: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe a quantidade de horas-extras trabalhadas: ");
        double horasExtras = scanner.nextDouble();

        double salarioHoraExtra = horasExtras * VALOR_HORA_EXTRA;
        double salarioBruto = 3 * SALARIO_MINIMO + salarioHoraExtra;
        double descontoINSS = 0;
        double descontoImpostoRenda = 0;

        if (salarioBruto > 1500.00) {
            descontoINSS = 0.12 * salarioBruto;
        }

        if (salarioBruto > 2000.00) {
            descontoImpostoRenda = 0.20 * salarioBruto;
        }

        double salarioLiquido = salarioBruto - descontoINSS - descontoImpostoRenda;

        System.out.println("\nFuncionário: " + matricula);
        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Desconto INSS: R$ " + String.format("%.2f", descontoINSS));
        System.out.println("Desconto Imposto de Renda: R$ " + String.format("%.2f", descontoImpostoRenda));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));

        scanner.close();
    }
}