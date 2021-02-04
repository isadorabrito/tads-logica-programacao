import java.util.Scanner;

public class Ex054 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numero, cont, n;

        numero = 1;
        cont = 0;

        System.out.print("Digite um valor de n: ");
        n = in.nextInt();

        while (numero <= n) {
            if (n % numero == 0) {
                cont++;
            }
            numero++;
        }

        if (cont <= 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}