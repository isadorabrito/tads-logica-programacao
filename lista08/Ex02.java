import java.util.Scanner;
import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int vezes, face1 = 0, face2 = 0, face3 = 0, face4 = 0, face5 = 0, face6 = 0;

        System.out.print("Informe a quantidade de vezes: ");
        vezes = in.nextInt();

        int[] vetordado = new int[vezes];

        for (int i = 0; i < vezes; i++) {

            vetordado[i] = random.nextInt(6) + 1;
        }

        System.out.print("Resultado =  ");
        for (int i = 0; i < vezes; i++) {
            System.out.print(vetordado[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < vezes; i++) {
            if (vetordado[i] == 1) {
                face1++;
            }
            if (vetordado[i] == 2) {
                face2++;
            }
            if (vetordado[i] == 3) {
                face3++;
            }
            if (vetordado[i] == 4) {
                face4++;
            }
            if (vetordado[i] == 5) {
                face5++;
            }
            if (vetordado[i] == 6) {
                face6++;
            }
        }
        System.out.println("O numero 1 obteve " + face1 + " ocorrências.\nO numero 2 obteve " + face2
                + " ocorrências.\nO numero 3 obteve " + face3 + " ocorrências.\nO numero 4 obteve " + face4
                + " ocorrências.\nO numero 5 obteve " + face5 + " ocorrências.\nO numero 6 obteve " + face6
                + " ocorrências.");
    }
}
