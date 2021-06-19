import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, c, n;

        a = 0;
        b = 1;

        System.out.println("Digite o numero máximo: ");
        n = in.nextInt();

        System.out.print(b);
        c = a + b;

        for (; c <= n; c = a + b) {
            System.out.print(", " + c);
            a = b;
            b = c;
        }

        System.out.println(" ");
    }
}