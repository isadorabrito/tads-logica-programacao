import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[20];
        int aux;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = in.nextInt();
        }

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < vetor.length; i++) {
            aux = vetor[i];
            vetor[i] = vetor[i + 10];
            vetor[i + 10] = aux;

            if (i == 9) {
                System.out.print("Vetor modificado: ");
                for (int j = 0; j < vetor.length; j++) {
                    System.out.print(vetor[j] + " ");
                }
                System.out.println();
                break;
            }
        }
    }
}