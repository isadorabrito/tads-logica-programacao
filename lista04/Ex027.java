import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor, n, ant;
        int cont = 0;
        int soma = 0;

        System.out.print("Digite o valor: ");
        valor = in.nextInt();
        System.out.print("Digite o numero de vezes: ");
        n = in.nextInt();

        while (cont <= n) {
            if (valor >= 100000 || soma >= 100000) {
                break;
            }
            ant = valor;
            valor = valor * 2;
            System.out.println("Dobro: " + valor);
            soma = valor + ant;
            System.out.println("Soma com antecessor:" + soma);
            cont++;
        }
    }
}