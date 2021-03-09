import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, c, numero;
        a = 0;
        b = 1;

        System.out.println("Digite um numero: ");
        numero = in.nextInt();

        System.out.print(a + " " + b);
        c = a + b;

        for ( ; c <= numero; c = a + b) {
            System.out.print(", " + c);
            a = b;
            b = c;
        }

        System.out.println(" ");
    }
}