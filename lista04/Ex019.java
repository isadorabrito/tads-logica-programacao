import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;

        int cont = 0;
        int s = 1;
        int f = 0;

        System.out.print("Digite o valor de n: ");
        n = in.nextInt();

        while (cont <= n) {
            System.out.println(f);
            s = s + f;
            f = s - f;
            cont++;
        }
    }
}