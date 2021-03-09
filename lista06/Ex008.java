import java.util.Scanner;
public class Ex008 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor=0, dobro = Integer.MAX_VALUE;

        while (valor <= dobro) {
        System.out.println("Digite um valor positivo: ");
        valor = in.nextInt();
        if (valor > dobro) {
            break;
        }
        dobro = valor * valor;
        }
    }
}