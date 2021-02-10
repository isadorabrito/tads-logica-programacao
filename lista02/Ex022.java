import java.util.Scanner;
public class Ex022 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nconta;
        float saldo, debito, credito,saldoatual;

        System.out.print("Digite o número da sua conta: ");
        nconta = in.nextInt();
        System.out.print("Digite o valor do seu saldo: ");
        saldo = in.nextFloat();
        System.out.print("Digite o valor do seu débito:");
        debito = in.nextFloat();
        System.out.print("Digite o valor do seu cŕedito: ");
        credito = in.nextFloat();

        saldoatual = (saldo - debito + credito);
        System.out.printf("Seu saldo atual é R$ %.2f reais. %n",saldoatual);

        if (saldoatual >= 0) {
            System.out.println("Saldo Positivo.");
        } else {
            System.out.println("Saldo Negativo.");
        }
    }
}