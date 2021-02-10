import java.util.Scanner;

public class ModeloProva0107 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numero;
        int divisor = 2;

        System.out.print("Digite o numero: ");
        numero = in.nextInt();

        boolean trocou = false;

        while (numero > 1) {
            if (numero % divisor == 0) {
                if (trocou) {
                    System.out.println();
                    trocou = false;
                }
                System.out.print(divisor + " ");
                numero = numero / divisor;
            } else {
                divisor++;
                trocou = true;
            }
        }
    }
}