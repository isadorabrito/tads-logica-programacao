import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        double fat, e=1;

        System.out.print("Digite o valor de n: ");
        n = in.nextInt();

        for (int den=1; den <=n; den++) {
            fat = den;
            for (int i=n; i > 1; i--) {
                fat *= i;
            }
            e +=(1+(1/fat));
        }
        System.out.println("E = " + e);
    }
}