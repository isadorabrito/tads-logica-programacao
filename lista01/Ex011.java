import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a,b,c,delta;
        double x1,x2;

        System.out.print("Informe o valor de a, b e c: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        delta = (b*b) - 4*a*c;

        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("O valor de x1 é " +x1+ " e o valor de x2 é "+x2);
    }
}