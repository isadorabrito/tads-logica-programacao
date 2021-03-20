import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float[] valores;
        float soma = 0, media;

        valores = new float[10];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe os 10 valores: ");
            valores[i] = in.nextFloat();

            soma +=valores[i];
        }
    
        media = soma/valores.length;
        System.out.println("A media entres os " + valores.length + " valores é " + media);
    }
}