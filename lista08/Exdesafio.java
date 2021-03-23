import java.util.Arrays;
import java.util.Scanner;

public class Exdesafio {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int vetor1[] = new int[5];

        int vetor2[] = new int[vetor1.length];

        int vetorFinal[] = new int[vetor1.length + vetor2.length];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite os valores do vetor 1: ");
            vetor1[i] = in.nextInt();
        }

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite os valores do vetor 2: ");
            vetor2[i] = in.nextInt();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                vetorFinal[i] = vetor1[i];
            }

            if (i > 4) {
                vetorFinal[i] = vetor2[i - 5];
            }
        }

        Arrays.sort(vetorFinal);

        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetorFinal.length; i++) {
            System.out.print(vetorFinal[i] + " ");
        }
        System.out.println();
    }
}