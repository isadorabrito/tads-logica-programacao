import java.util.Scanner;
public class Ex015 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor qualquer: ");
        valor = in.nextInt();

        if (valor>=0) {
            System.out.println(valor+" é positivo.");
        } else {
            System.out.println(valor+" é negativo.");
        }
    }
}