import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int mes;
        float multa;

        System.out.print("Digite o valor da multa: ");
        multa = in.nextInt();

        System.out.print("Digite o numero do mês que foi paga: ");
        mes = in.nextInt();

        switch (mes) {
        case 1:
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        case 2:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        case 3:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        case 4:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n", multa);
            break;

        case 5:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        case 6:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        case 7:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        case 8:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        case 9:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        case 10:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        case 11:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        case 12:
            for (int i = 1; i < mes; i++) {
                multa += (multa * 0.05f);
            }
            System.out.printf("O valor da multa é R$ %.2f reais.\n",  multa);
            break;

        default:
            System.out.println("Mẽs inválido.");

        }
    }
}