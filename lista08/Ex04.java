import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor do vetor na posicao " + (i + 1) + ": ");
            vetor[i] = in.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i] + "- é par.");
            }
        }
        System.out.println();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i] + "- é impar.");
            }
        }
        System.out.println();
    }
}