import java.util.Scanner;

public class ModeloProva0106 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double denominador = 1;
        int n;
        double soma = 0;
        double res = 0;
        int cont = 1;
        int num = 1;

        System.out.println("Quantas interações serao feitas: ");
        n = in.nextInt();

        while (cont <= n) {
            if (cont % 2 != 0) {
                soma += num / denominador;
            } else {
                soma -= num / denominador;
            }
            denominador += 2;
            cont++;
        }
        res = 4 * soma;
        System.out.println("res: " + res);
    }
}