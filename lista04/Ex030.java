import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numerador = 1;
        int denominador = 1;
        long fatorial = 1;
        int n;
        double soma = 0;

        System.out.print("Digite o valor de n: ");
        n = in.nextInt();

        while (numerador < n) {

            int valor = denominador;
            fatorial = 1;

            while (valor > 1) {
                fatorial *= valor;
                valor--;
            }

            soma += (double) numerador / fatorial;

            System.out.println(numerador + "/" + denominador + "!" + " Fat: " + fatorial + "Soma atual: " + soma);

            numerador++;
            denominador += 2;
        }
    }
}