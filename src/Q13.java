import java.util.Scanner;

public class Q13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a senha: ");
    int senha = scanner.nextInt();

    int senhaArmazenada = senha;

    while (true) {
      System.out.print("Digite a senha novamente: ");
      int senhaDigitada = scanner.nextInt();

      if (senhaDigitada == senhaArmazenada) {
        System.out.println("Senha correta! Bem-vindo ao sistema.");
        break;
      } else {
        System.out.println("Senha incorreta, tente novamente.");
      }
    }
  }
}