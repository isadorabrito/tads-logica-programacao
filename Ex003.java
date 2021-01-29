import java.util.Scanner;
public class Ex003 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, quadrado;

        System.out.print("Digite um número inteiro: ");
        n = in.nextInt();

        quadrado = n * n;

        System.out.printf("O quadrado de %d é %d. %n", n, quadrado);
    }
}