import java.util.Scanner;
public class Ex062 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float a, b, div;

        System.out.print("Digite dois valores: ");
        a = in.nextFloat();
        b = in.nextFloat();

        while (b == 0) {
        System.out.print("Segundo valor inválido. Digite novamente: ");
        b = in.nextFloat();
        }

        div = a/b;
        System.out.println("A divisão entre "+a+" e " +b+" é "+div);
    }
}