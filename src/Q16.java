import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();

        System.out.println("Números primos entre 1 e " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}