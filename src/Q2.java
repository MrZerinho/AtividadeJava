import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);

        System.out.print("Informe sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 16 && idade <= 17){
            System.out.println("O eleitor é facultativo.");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("O eleitor é obrigatorio.");
        } else if (idade > 65) {
            System.out.println("O eleitor é isento.");
        } else {
            System.out.println("Você não está qualificado para votar.");
        }



    }
    
}
