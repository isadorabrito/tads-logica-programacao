import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int dia;

        System.out.print("Digite o dia: ");
        dia = in.nextInt();

        switch (dia) {
        case 1:
        case 7:
            System.out.println("Fim de Semana!");
            break;

        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
            System.out.println("Dia de Semana!");
            break;
        default:
            System.out.println("Dia inválido.");
        }
    }
}