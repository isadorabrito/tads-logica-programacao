import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int numeros;

        System.out.print("Informe a quantidade de números da sequência: ");
        numeros = in.nextInt();

        int[] sequencia = new int[numeros];

        for (int i=0; i < sequencia.length; i++) {
            System.out.print("Informe o número para a posição " +(i+1)+ ": ");
            sequencia[i] = in.nextInt();
        }
        
        for (int i = sequencia.length -1; i >= 0; i--) {
            System.out.print(sequencia[i] + "\t");
        }
        System.out.println();
    }  
}