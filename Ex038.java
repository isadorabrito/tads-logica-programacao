import java.util.Scanner;
public class Ex038 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Digite um número: ");
        n = in.nextInt();

        if (n > 0) {
            System.out.println("O número "+n+" é positivo.");
        } else if (n < 0) {
            System.out.println("O número "+n+" é negativo.");
        } else {
            System.out.println("O número "+n+" é igual zero.");
        }
    }
}