import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor1, valor2, res;
        char operacao;

        System.out.print("Digite os dois valores: ");
        valor1 = in.nextInt();
        valor2 = in.nextInt();
        System.out.println("Selecione a operacao desejada: \n[s - soma] [t - subtracao] [m - multiplicacao] [d - divisao]");
        operacao = in.next().charAt(0);

        switch (operacao) {
        case 's':
            res = valor1 + valor2;
            System.out.println("Resultado: " + res);
            break;
        case 't':
            res = valor1 - valor2;
            System.out.println("Resultado: " + res);
            break;
        case 'm':
            res = valor1 * valor2;
            System.out.println("Resultado: " + res);
            break;
        case 'd':
            res = valor1 / valor2;
            System.out.println("Resultado: " + res);
            break;
        default:
            System.out.println("Operacao inválida.");
        }
    }
}