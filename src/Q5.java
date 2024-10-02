import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de identificação do aluno: ");
        int numeroIdentificacao = scanner.nextInt();
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        // Validação das notas
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10 || mediaExercicios < 0 || mediaExercicios > 10) {
            System.out.println("Erro: As notas devem estar entre 0 e 10.");
            return;
        }

        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        String conceito;
        if (mediaAproveitamento >= 9.0 && mediaAproveitamento <= 10) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            conceito = "C";
        } else if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("\nNúmero do aluno: " + numeroIdentificacao);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}