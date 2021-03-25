import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int mes;

        System.out.print("Digite o numero do mês que estamos: ");
        mes = in.nextInt();

        switch (mes) {

        case 12:
        case 1:
        case 2:
        case 6:
        case 7:
            System.out.println("Alta temporada!");
            break;

        case 8:
        case 9:
        case 10:
        case 11:
        case 3:
        case 4:
        case 5:
            System.out.println("Baixa temporada!");
            break;

        default:
            System.out.println("Mês inválido.");
        }
    }
}