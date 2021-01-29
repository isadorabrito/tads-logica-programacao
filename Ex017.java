import java.util.Scanner;
public class Ex017 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float n1,n2,div;

        System.out.print("Digite dois valores reais: ");
        n1 = in.nextFloat();
        n2 = in.nextFloat();

        if (n2 !=0) {
            div = n1/n2;
            System.out.println(n1+" dividido por "+n2+ " é " +div);
        } else {
            System.out.println("Erro");
        }
    }
}