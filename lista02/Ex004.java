import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite dois números inteiros: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        if (n1>n2) {
            System.out.println("O primeiro valor (" +n1+ ") é o maior.");
        } else {
            System.out.println("O segundo valor (" +n2+ ") é o maior.");
        }
    }
}