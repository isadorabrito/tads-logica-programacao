import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int maior = 0, menor = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a idade numero " + (i + 1) + ": ");
            vetor[i] = in.nextInt();

            if (vetor[i] >= 18) {
                maior++;
            } else if (vetor[i] < 18) {
                menor++;
            }
        }
        System.out.println();

        System.out.print("Vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length - 1) {
                System.out.print(vetor[i] + "]");
            } else {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();

        System.out.println(menor + " menor(es) de idade.");
        System.out.println(maior + " maior(es) de idade.");
    }
}