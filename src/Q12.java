import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o nome do aluno: ");
        String nome = input.nextLine();

        double notaA, notaB;

        do {
            System.out.print("Entre com o grau A: ");
            notaA = input.nextDouble();

            if (notaA < 0 || notaA > 10) {
                System.out.println("ERRO: Nota inválida! Digite novamente a nota.");
            }
        } while (notaA < 0 || notaA > 10);

        do {
            System.out.print("Entre com o grau B: ");
            notaB = input.nextDouble();

            if (notaB < 0 || notaB > 10) {
                System.out.println("ERRO: Nota inválida! Digite novamente a nota.");
            }
        } while (notaB < 0 || notaB > 10);

        double media = (notaA + notaB) / 2;

        System.out.printf("O aluno %s tem uma media: %.2f\n", nome, media);

        System.out.print("Continuar (sim/nao)? ");
        input.nextLine(); 
        String resposta = input.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            main(args);
        } else {
            System.out.println("Programa encerrado.");
        }

        input.close();
    }
}