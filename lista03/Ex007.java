import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char combustivel;
        float desc,valor;
        int  litros;

        System.out.print("Digite o tipo de combustivel: [a] para alcool e [g] para gasolina: ");
        combustivel = in.next().charAt(0);
        System.out.print("Digite o número de litros vendidos: ");
        litros = in.nextInt();

        if (combustivel == 'a') {
            if (litros <= 20) {
                desc = litros * 0.03f;
            } else {
                desc = litros*0.05f;
            }
            valor = (litros * 4.30f) - desc;
            System.out.printf("O valor a ser pago é R$ %.2f reais. %n", valor);
        } else if (combustivel == 'g') {
            if (litros <= 20) {
                desc = litros * 0.04f;
            } else {
                desc = litros * 0.06f;
            }
            valor = (litros * 3.90f) - desc;
            System.out.printf("O valor a ser pago é R$ %.2f reais. %n", valor);
        } else {
            System.out.println("Opção não encontrada.");
        }     
    }
}