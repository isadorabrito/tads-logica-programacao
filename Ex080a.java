import java.util.Scanner;

public class Ex080a {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, resto, d1, d2, d3, prod;
        int cont = 100;
        int i = 0;
        while (cont <= 999) {
            d1 = cont / 100; // centena
            resto = cont % 100;
            d2 = resto / 10; // dezena
            d3 = resto % 10; // unidade
            prod = (d1 * d2 * d3);
            System.out.printf("(%d * %d * %d) = %d.%n", d1, d2, d3, prod);
            cont++;
            i++;
            if (i == 20) {
                System.out.println("\n");
                while (i != 0) {
                    System.out.print("Para continuar a sequencia digite 0: ");
                    i = in.nextInt();
                }
            }
        }
    }
}