import java.util.Scanner;
public class Ex021 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double raio,diametro,comprimento,area,pi;
       
        System.out.print("Qual o raio da circunferência? ");
        raio = in.nextFloat();

        pi = 3.141692;
        diametro = raio* 2;
        comprimento = 2 * pi * raio;
        area = pi * (raio*raio);

        System.out.printf("O diametro da circunferencia é %.1fcm.%n", diametro);
        System.out.printf("O comprimento da circunferencia é %.1fcm.%n", comprimento);
        System.out.printf("A área da circunferencia é %.1fcm.%n", area);
    }
}