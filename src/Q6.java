import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        String classificacao = getClassificacao(codigo);
        System.out.println("Classificação: " + classificacao);
    }

    public static String getClassificacao(int codigo) {
        if (codigo == 1) {
            return "Alimento não-perecível";
        } else if (codigo >= 2 && codigo <= 4) {
            return "Alimento perecível";
        } else if (codigo >= 5 && codigo <= 6) {
            return "Vestuário";
        } else if (codigo == 7) {
            return "Higiene pessoal";
        } else if (codigo >= 8 && codigo <= 15) {
            return "Limpeza e utensílios domésticos";
        } else {
            return "Inválido";
        }
    }
}