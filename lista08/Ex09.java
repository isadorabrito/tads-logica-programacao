import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vetor = { 1, 2, 3, 4, 5 };
        int valor;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor presente no vetor: ");
            valor = in.nextInt();

            while (valor != vetor[i]) {
                System.out.print("Valor incorreto, tente novamente: ");
                valor = in.nextInt();
            }
            if (valor == vetor[i]) {
                if (valor == vetor[4]) {
                    System.out.print("Você acertou!! Vetor Correto: ");
                    for (int j = 0; j < vetor.length; j++) {
                        System.out.print(vetor[j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}