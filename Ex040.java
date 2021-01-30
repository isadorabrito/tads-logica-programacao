import java.util.Scanner;
public class Ex040 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1,n2,n3,soma;

        System.out.print("Digite três valores: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if (n1 < n2 && n1 < n3) {
        soma = n2 + n3;
        } else if (n2 < n1 && n2 < n3) {
            soma = n1 + n3;
        } else {
            soma = n1 + n2;
        }
        System.out.println("A soma dos dois maiores é " +soma);
    }
}