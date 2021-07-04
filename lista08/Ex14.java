import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int a = 1, aux, posicao1 = 0, posicao2 = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        while (a > 0) {
            System.out.print("Digite duas posicoes: ");
            posicao1 = in.nextInt();
            posicao2 = in.nextInt();

            aux = vetor[posicao1];
            vetor[posicao1] = vetor[posicao2];
            vetor[posicao2] = aux;

            System.out.print("Vetor Alterado: ");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();

            System.out.print("Digite algum valor para continuar ou 0 para sair: ");
            a = in.nextInt();
        }
    }
}