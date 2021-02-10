import java.util.Scanner;
public class Ex011 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1,n2,soma;

        System.out.println("Digite os dois valores: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        soma = n1+n2;

        if (soma > 20) {
        soma +=8;
        } else {
        soma -=10;
        }    
        System.out.println("O valor somado é "+soma);
    }
}