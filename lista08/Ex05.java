import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[20];
        int aux, j=10;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = in.nextInt();
        }

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < vetor.length / 2; i++) {
            aux = vetor[j];
            vetor[j] = vetor[i];
            vetor[i] = aux;
            j++;
        }
        System.out.print("Vetor modificado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}