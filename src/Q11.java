import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do divisor: ");
        int divisor = scanner.nextInt();
        System.out.print("Inicio do Intervalo: ");
        int inicioIntervalo = scanner.nextInt();
        System.out.print("Fim do Intervalo: ");
        int fimIntervalo = scanner.nextInt();

        System.out.print("Números divisíveis por " + divisor + " no intervalo de " + inicioIntervalo + " a " + fimIntervalo + ": ");
        for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
            if (i % divisor == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}