import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um inteiro não negativo: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Entrada inválida! Por favor, digite um inteiro não negativo.");
        } else {
            long fatorial = calcularFatorial(n);
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
    }

    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}