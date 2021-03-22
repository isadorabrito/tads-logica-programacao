import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] v1 = new int[10];
        int[] v2 = new int[v1.length];
        int soma = 0;

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Digite os valor do vetor 1: ");
            v1[i] = in.nextInt();
        }
        for (int i = 0; i < v2.length; i++) {
            soma += v1[i];
            v2[i] = soma;
        }

        System.out.print("Vetor 1: ");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor 2: ");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.println();
    }
}