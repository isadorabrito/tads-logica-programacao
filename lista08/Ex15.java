import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[20];
        int x, contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite os valores do vetor: ");
            vetor[i] = in.nextInt();
        }
        System.out.println();

        System.out.print("Digite um valor X: ");
        x = in.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (x == vetor[i]) {
                System.out.println("O valor " + x + " está na posição " + i + " do vetor.");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("O valor " + x + " não consta no vetor.");
        }

    }
}