import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[12];
        int x = 0, y = 0, soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor do vetor na posição " + (i) + ": ");
            vetor[i] = in.nextInt();
        }

        while (x >= 0 || y >= 0) {
            System.out.print("Digite o valor de X e Y respectivamente: ");
            x = in.nextInt();
            y = in.nextInt();

            if (x == -1 || y == -1) {
                break;
            }

            for (int i = 0; i < vetor.length; i++) {
                soma = vetor[x] + vetor[y];
            }

            System.out.println("A soma da posição x e y é " + soma);
        }
    }
}