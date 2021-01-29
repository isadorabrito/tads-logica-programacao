import java.util.Scanner;
public class Ex005 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double f,c;

        System.out.print("Digite a temperatura em fahrenheit: ");
        f = in.nextFloat();

        c =  (f - 32)/1.8;

        System.out.printf("A temperatura em Celsius é %.1f graus. %n", c);
    }
}
