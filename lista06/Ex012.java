import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int somadivisores = 0;

        for (int numero = 1; numero <= 1000; numero++) {
            for (int divisor = 1; divisor < numero; divisor++) {

                if (numero % divisor == 0) {
                    somadivisores += divisor;
                }
            }

            if (somadivisores == numero) {
                System.out.println(numero + " é um número perfeito.");
            }

            somadivisores = 0;
        }
    }
}