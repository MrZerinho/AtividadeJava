import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da pirâmide: ");
        int linhas = scanner.nextInt();

        // Loop para cada linha da pirâmide
        for (int i = 1; i <= linhas; i++) {
            // Imprime espaços em branco para alinhar a pirâmide
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(" ");
            }
            // Imprime os asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Pula para a próxima linha
            System.out.println();
        }
    }
}