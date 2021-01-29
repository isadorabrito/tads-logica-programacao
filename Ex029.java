import java.util.Scanner;
public class Ex029 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float custofabrica;
        double adicionais, custofinal;

        System.out.println("Digite o custo de fábrica do produto: ");
        custofabrica = in.nextFloat();

        adicionais = (custofabrica*0.28) + (custofabrica*0.45);
        custofinal = custofabrica + adicionais;

        System.out.printf("O custo final do produto é R$ %.2f reais.%n", custofinal);
    }
}