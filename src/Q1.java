import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner (System.in);   

        System.out.println("De um valor inteiro para A: ");
        int A = leitor.nextInt();

        System.out.println("De um valor inteiro para B: ");
        int B = leitor.nextInt();

        if (A % B == 0){
            System.out.println("O valor A é divisivel por B.");
        }
        else{
            System.out.println("O valor A não é divisivel por B.");
        }
        
    }
}
