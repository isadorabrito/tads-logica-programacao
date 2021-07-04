import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[20];
        int posicao, maiores = 0, menores = 0, iguais = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o elemento da posição " + (i) + ": ");
            vetor[i] = in.nextInt();
        }

        System.out.println("Escolha uma posicao do vetor: ");
        posicao = in.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[posicao] < vetor[i]) {
                maiores++;
            }
            if (vetor[posicao] > vetor[i]) {
                menores++;
            }
            if (vetor[posicao] == vetor[i]) {
                iguais++;
            }
        }
        System.out.println(maiores + " elemento(s) maior(es) que ele; \n" + menores + " elemento(s) menor(es) que ele; \n" + (iguais - 1) + " elemento(s) igual(is) a ele.");
    }
}