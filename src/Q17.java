import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPedido = 0;

        while (true) {
            System.out.println("Digite o código do produto (ou 0 para encerrar o pedido):");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.println("Digite a quantidade:");
            int quantidade = scanner.nextInt();

            double preco = getPreco(codigo);

            if (preco == 0) {
                System.out.println("Código inválido.");
            } else {
                double valorProduto = preco * quantidade;
                System.out.println("Valor do produto: R$ " + valorProduto);
                totalPedido += valorProduto;
            }
        }

        System.out.println("Total do pedido: R$ " + totalPedido);
    }

    private static double getPreco(int codigo) {
        switch (codigo) {
            case 1:
                return 1.50;
            case 2:
                return 2.00;
            case 3:
                return 2.50;
            case 4:
                return 3.00;
            case 5:
                return 1.50;
            default:
                return 0;
        }
    }
}