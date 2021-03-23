import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int mes, ano;

        System.out.print("Digite o mês do ano: ");
        mes = in.nextInt();
        System.out.print("Digite o ano: ");
        ano = in.nextInt();

        switch (mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("31 dias!");
            break;

        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("30 dias!");
            break;

        case 2:
            if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)) {
                System.out.println("29 dias! \nAno bissexto.");
            } else {
                System.out.println("28 dias!");
            }
            break;
        default:
            System.out.println("Mês inválido.");
        }
    }
}