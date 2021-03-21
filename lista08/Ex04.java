import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] vetorpar = new int[vetor.length];
        int[] vetorimpar = new int[vetor.length];
        int par = 0, impar = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = in.nextInt();

            if (vetor[i] % 2 == 0) {
                vetorpar[par] = vetor[i];
                par++;
            } else {
                vetorimpar[impar] = vetor[i];
                impar++;
            }
        }

        System.out.print("Numeros digitados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.print("Numeros pares: ");
        for (int i = 0; i < par; i++) {
            System.out.print(vetorpar[i] + " ");
        }
        System.out.println();

        System.out.print("Numeros ímpares: ");
        for (int i = 0; i < impar; i++) {
            System.out.print(vetorimpar[i] + " ");
        }
        System.out.println();
    }
}