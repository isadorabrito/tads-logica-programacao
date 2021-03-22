import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tamanho, soma = 0;

        System.out.print("Digite o tamanho do vetor: ");
        tamanho = in.nextInt();

        int[] vetor1 =  new int[tamanho];
        int[] vetor2 =  new int[vetor1.length];
        int[] vetor3 =  new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite os valores do vetor 1: ");
            vetor1[i] = in.nextInt();
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite os valores do vetor 2: ");
            vetor2[i] = in.nextInt();
            vetor3[i] = (vetor1[i] + vetor2[i]);
        }
        System.out.println();

        System.out.print("Primeiro vetor: ");
        for (int i=0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        System.out.print("Segundo vetor: ");
        for (int i=0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

        System.out.print("Terceiro vetor: ");
        for (int i=0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }
        System.out.println();
    }
}