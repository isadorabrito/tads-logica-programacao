import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int letras;
        String palavra = " ";

        System.out.print("Digite a quantidade de letras da sua palavra: ");
        letras = in.nextInt();

        char[] vetor = new char[letras];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a letra de da posição " + (i+1) + ": ");
            vetor[i] = in.next().charAt(0);
        }

        for (int i = 0; i < vetor.length; i++) {
            palavra += vetor[i];
        }
        System.out.print("Sua palavra é:" + palavra);
        System.out.println();

    }
}