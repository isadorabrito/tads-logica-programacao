import java.util.Scanner;
public class Ex002 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        double valor;
        double total;

        System.out.print("Digite um valor real: ");
        valor = in.nextDouble();

        total = valor * 1.20;

        System.out.printf ("O total com 20%% é R$ %.2f reais.%n", total);
    }
}