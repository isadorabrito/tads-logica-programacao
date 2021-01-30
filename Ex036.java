import java.util.Scanner;
public class Ex036 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int homem1, homem2, mulher1, mulher2, hnovo, hvelho, mnova, mvelha, soma, produto;

        System.out.print("Digite a idade do primeiro homem e primeira mulher: ");
        homem1 = in.nextInt();
        mulher1 = in.nextInt();

        System.out.print("Digite a idade do segundo homem e segunda mulher: ");
        homem2 = in.nextInt();
        mulher2 = in.nextInt();

        if (homem1 > homem2 && mulher1 > mulher2) {
            hnovo = homem2;
            hvelho = homem1;
            mnova = mulher2;
            mvelha = mulher1;
        } else if (homem1 > homem2 && mulher2 > mulher1) {
            hnovo = homem2;
            hvelho = homem1;
            mnova = mulher1;
            mvelha = mulher2;
        } else if (homem2 > homem1 && mulher1 > mulher2) {
            hnovo = homem1;
            hvelho = homem2;
            mnova = mulher2;
            mvelha = mulher1;
        } else {
            hnovo = homem1;
            hvelho = homem2;
            mnova = mulher1;
            mvelha = mulher2;
        }

        soma = hvelho + mnova;
        produto = hnovo * mvelha;

        System.out.printf("Mulher mais nova: %d; %nMulher mais velha: %d; %nHomem mais novo: %d; %nHomem mais velho: %d; %n", mnova, mvelha, hnovo, hvelho);
        System.out.println("O somatório das idades do homem mais velho e mulher mais nova é " +soma);
        System.out.println("O produto das idades do homem mais novo e mulher mais velha é " +produto);
    }
}