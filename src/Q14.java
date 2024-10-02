import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do aluno (ou 'sair' para finalizar): ");
            String nome = scanner.next();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite a nota 1 do aluno: ");
            double nota1 = scanner.nextDouble();
            while (nota1 < 0.0 || nota1 > 10.0) {
                System.out.print("Nota inválida. Digite novamente: ");
                nota1 = scanner.nextDouble();
            }

            System.out.print("Digite a nota 2 do aluno: ");
            double nota2 = scanner.nextDouble();
            while (nota2 < 0.0 || nota2 > 10.0) {
                System.out.print("Nota inválida. Digite novamente: ");
                nota2 = scanner.nextDouble();
            }

            Aluno aluno = new Aluno(nome, nota1, nota2);
            alunos.add(aluno);
        }

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        double mediaClasse = 0.0;
        int aprovados = 0;
        int reprovados = 0;
        int exame = 0;

        for (Aluno aluno : alunos) {
            double media = aluno.getMedia();
            mediaClasse += media;

            if (media < 3.0) {
                reprovados++;
            } else if (media < 7.0) {
                exame++;
            } else {
                aprovados++;
            }
        }

        mediaClasse /= alunos.size();

        System.out.println("Relatório:");
        System.out.println("---------");
        System.out.println("Total de alunos: " + alunos.size());
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Exame: " + exame);
        System.out.println("Média da classe: " + String.format("%.2f", mediaClasse));

        Aluno maiorMedia = null;
        Aluno menorMedia = null;
        for (Aluno aluno : alunos) {
            if (maiorMedia == null || aluno.getMedia() > maiorMedia.getMedia()) {
                maiorMedia = aluno;
            }
            if (menorMedia == null || aluno.getMedia() < menorMedia.getMedia()) {
                menorMedia = aluno;
            }
        }

        System.out.println("Aluno com maior média: " + maiorMedia.getNome() + " - " + String.format("%.2f", maiorMedia.getMedia()));
        System.out.println("Aluno com menor média: " + menorMedia.getNome() + " - " + String.format("%.2f", menorMedia.getMedia()));
    }
}

class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return (nota1 + nota2) / 2.0;
    }
}