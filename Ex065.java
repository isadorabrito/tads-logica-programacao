import java.util.Scanner;
public class Ex065 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        float valor, soma, mult;

        n = 0;
        mult = 1;
        soma = 0;

        while(n < 10) {
            System.out.print("Digite um valor: ");
            valor = in.nextFloat();

            if (valor >= 1 && valor <= 10) {
                mult = mult * valor;
            } else {
                soma = soma + valor;
            }
            n++;
        }
        System.out.println("A multiplicação entre valores digitados no intervalo de 0 e 10 é "+mult);
        System.out.println("A soma dos valores fora deste intervalo é "+soma);
    }
}