import java.util.Scanner;
public class Ex012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        float preco;

        System.out.print("Qual foi o numero de maças compradas? ");
        n = in.nextInt();

        if (n<12) {
            preco = 1.50f;
        } else {
            preco = 1.30f;
        }
        preco = preco * n;
        System.out.printf("O custo total foi R$ %.2f reais.%n", preco);
    }
}