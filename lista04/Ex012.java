import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor: ");
        valor = in.nextInt();

        while (valor % 5 != 0) {
            System.out.print("Digite um valor:");
            valor = in.nextInt();
        }
        System.out.println("O valor " + valor + " é multiplo de 5.");
    }
}