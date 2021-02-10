import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1 = 1;
        int ntotal = 1;
        int x = 1;

        while (x > 0) {
            System.out.println("Digite o numero: \nPara sair digite algum valor menor ou igual a zero: ");
            x = in.nextInt();
            while (ntotal < x) {
                n1 += 2;
                ntotal += n1;
            }
            if (x == ntotal) {
                System.out.println("\tÉ quadrado perfeito\n");
            } else {
                System.out.println("\tNao é quadrado perfeito\n");
            }
        }
    }
}