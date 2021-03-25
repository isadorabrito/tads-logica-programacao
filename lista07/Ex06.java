import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char letra;

        System.out.print("Digite [F] ou [M]: ");
        letra = in.next().charAt(0);

        switch (letra) {
        case 'F':
        case 'f':
            System.out.println("F - Feminino");
            break;

        case 'M':
        case 'm':
            System.out.println("M - Masculino");
            break;

        default:
            System.out.println("Gênero inválido. Digite [F] ou [M].");
        }
    }
}