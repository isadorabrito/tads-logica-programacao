import java.util.Scanner;

public class ModeloProva0101 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, maior=0, menor=0, igual=0;
        int cont = 1;
        while (cont <= 100) {
            System.out.print("Digite o numero: ");
            n = in.nextInt();
            if (n > 0) {
                maior += 1;
            } else if (n < 0) {
                menor += 1;
            } else {
                igual += 1;
            }
            cont++;
        }
        System.out.printf("%d são maiores que zero.%n", maior);
        System.out.printf("%d são menores que zero.%n", menor);
        System.out.printf("%d são iguais a zero.%n", igual);
    }
}