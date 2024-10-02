import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.00;

        while (true) {
            System.out.println("Opções:");
            System.out.println("(a) consulta saldo");
            System.out.println("(b) saque");
            System.out.println("(c) depósito");
            System.out.println("(d) sair");
            System.out.print("> ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "a":

                    System.out.println("R$ " + saldo);
                    break;
                case "b":
                    // Saque
                    System.out.print("valor: ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine(); 

                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso.");
                    }
                    break;
                case "c":
                    System.out.print("valor: ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine(); 

                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case "d":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println();
        }
    }
}