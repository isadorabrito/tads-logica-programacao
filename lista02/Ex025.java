import java.util.Scanner;
public class Ex025 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int moeda1, moeda50, moeda25, moeda10, moeda5;
        float cofre, produto;

        System.out.print("Digite o valor do produto que você deseja comprar: R$ ");
        produto = in.nextFloat();
        System.out.print("Digite a quantidade de moedas de um real: ");
        moeda1 = in.nextInt();
        System.out.print("Digite a quantidade de moedas de cinquenta centavos: ");
        moeda50 = in.nextInt();
        System.out.print("Digite a quantidade de moedas de vinte e cinco centavos: ");
        moeda25 = in.nextInt();
        System.out.print("Digite a quantidade de moedas de dez centavos: ");
        moeda10 = in.nextInt();
        System.out.print("Digite a quantidade de moedas de cinco centavos: ");
        moeda5 = in.nextInt();

        cofre = (moeda1 * 1 + moeda50 * 0.5f + moeda25 * 0.25f + moeda10 * 0.10f + moeda5 * 0.05f);

        if(produto > cofre) {
            System.out.printf("Você possui R$ %.2f. reais.%nAinda não tem o suficiente para comprar o produto. %n", cofre);
        } else {
            System.out.printf("Você possui R$ %.2f reais. %nJa pode comprar o produto. %n", cofre);
        }
    }
}