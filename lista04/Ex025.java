import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numero = 1;
        int somador = 0;
        int auxiliar = 1;

        while (numero > 0) {
            numero = in.nextInt();
            if (numero <= 0) {
                break;
            }

            while (somador < numero) {
                if (auxiliar % 2 != 0) {
                    somador = somador + auxiliar;
                }
                auxiliar++;
            }
            if (somador == numero) {
                System.out.println("Quadrado Perfeito");
            } else {
                System.out.println("Não é Quadrado Perfeito");
            }
            auxiliar = 1;
            somador = 0;
        }
    }
}