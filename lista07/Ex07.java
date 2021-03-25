import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char turno;

        System.out.print("Digite seu turno [M] - Matutino, [V] - Vespertino, [N] - Noturno: ");
        turno = in.next().charAt(0);

        switch (turno) {
        case 'm':
        case 'M':
            System.out.println("Bom dia!");
            break;
        case 'v':
        case 'V':
            System.out.println("Boa tarde!");
            break;
        case 'n':
        case 'N':
            System.out.println("Boa noite!");
            break;
        default:
            System.out.println("Valor inválido!");
        }
    }
}