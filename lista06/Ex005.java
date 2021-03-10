import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float x;

        System.out.println("Digite o valor de x para calcular e^x: ");
        x = in.nextFloat();

        float numerador = 1;
        float denominador = 1;
        float soma = 1;

        for (int i = 1; i < 10; i++) {
            numerador *= x;
            denominador *= i;
            soma += numerador / denominador;
        }
        System.out.println(soma);
    }
}