import java.util.Scanner;
public class Ex002 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1,n2,n3,maior;

        System.out.print("Digite três valores: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if (n1 > n2 && n1 > n3) {
        maior = n1;
        } else if (n2 > n1 && n2 > n3) {
        maior = n2;
        } else {
        maior = n3;
        }
        System.out.printf("O maior número entre %d, %d e %d é %d. %n", n1, n2, n3, maior);
    }   
}