import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1, n2, res, dobro;

        for (int numero = 1000; numero <= 9999; numero++) {
            n1 = (numero / 100);
            n2 = (numero % 100);
            res = (n1 + n2);
            dobro = res * res;

            if (dobro == numero) {
                System.out.println(numero);
            }
        }
    }
}