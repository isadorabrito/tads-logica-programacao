import java.util.Scanner;

public class Ex066 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, cont, aux;
        cont = 1;
        aux = 0;

        System.out.print("Insira o número: ");
        n = in.nextInt();

        while (cont <= n) {
            if (n % cont == 0) {
                aux++;
            }
            cont++;
        }
        if (aux <= 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}