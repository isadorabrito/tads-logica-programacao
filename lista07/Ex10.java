import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int produto;
        float valor;

        System.out.print("Digite o código do produto");
        produto = in.nextInt();
        
        System.out.print("Digite o preço de custo do produto: ");
        valor = in.nextFloat();

        switch (produto) {
        case 1:
        case 2:
            valor += valor * 0.8f;
            System.out.printf("Preço de venda do produto: R$ %.2f.%n", valor);
            break;
        case 3:
        case 4:
            valor += valor * 1f;
            System.out.printf("Preço de venda do produto: R$ %.2f.%n", valor);
            break;
        case 5:
        case 6:
            valor += valor * 0.9f;
            System.out.printf("Preço de venda do produto: R$ %.2f.%n", valor);
            break;
        default:
            System.out.println("Produto inválido.");
        }

    }
}