import java.util.Scanner;
public class Ex029 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float custofabrica,adicionais, custofinal;

        System.out.println("Digite o custo de fábrica do produto: ");
        custofabrica = in.nextFloat();

        adicionais = (custofabrica*0.28f) + (custofabrica*0.45f);
        custofinal = custofabrica + adicionais;

        System.out.printf("O custo final do produto é R$ %.2f reais.%n", custofinal);
    }
}