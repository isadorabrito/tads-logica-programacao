import java.util.Scanner;

public class Ex057 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor entre 1 e 10: ");
        valor = in.nextInt();

        while (valor < 1 || valor > 10) {
            System.out.print("Digite um valor entre 1 e 10: ");
            valor = in.nextInt();
        }
        System.out.println(valor);
    }
}