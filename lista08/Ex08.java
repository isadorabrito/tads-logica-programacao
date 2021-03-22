import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = new int[20];
        int elemento, maiores = 0, menores = 0, iguais = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o elemento da posição " + (i) + ": ");
            vetor[i] = in.nextInt();
        }

        System.out.print("Vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length - 1) {
                System.out.println(vetor[i] + "]");
            } else {
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.println("Escolha um elemento do vetor: ");
        elemento = in.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[elemento] < vetor[i]) {
                maiores++;
            }
            if (vetor[elemento] > vetor[i]) {
                menores++;
            }
            if (vetor[elemento] == vetor[i]) {
                iguais++;
            }      
        }
        System.out.println("O elemento [" + elemento + "] possui: \n" + maiores + " elemento(s) maior(es) que ele; \n" + menores + " elemento(s) menor(es) que ele; \n" + iguais + " elemento(s) igual(is) a ele.");
    }
}