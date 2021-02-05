import java.util.Scanner;

public class Ex080 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, resto, d1, d2, d3, prod;
        int cont = 100;
        while (cont <= 999) {
            d1 = cont / 100; // valor centena
            resto = cont % 100;
            d2 = resto / 10; // valor dezena
            d3 = resto % 10; // valor unidade
            prod = (d1 * d2 * d3);
            System.out.printf("%d (%d*%d*%d) = %d.%n",cont, d1, d2, d3, prod);
            cont++;
        }
    }
}