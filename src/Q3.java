import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorCompra, valorVenda;

        System.out.print("Digite o valor da compra: R$ ");
        valorCompra = input.nextDouble();

        if (valorCompra < 10.00) {
            valorVenda = valorCompra * 1.70; 
        } else if (valorCompra >= 10.00 && valorCompra < 30.00) {
            valorVenda = valorCompra * 1.50; 
        } else if (valorCompra >= 30.00 && valorCompra < 50.00) {
            valorVenda = valorCompra * 1.40; 
        } else if (valorCompra >= 50.00) {
            valorVenda = valorCompra * 1.30; 
        } else {
            System.out.println("Valor de compra inválido!");
            return;
        }

        System.out.printf("Valor da venda: R$ %.2f\n", valorVenda);
    }
}