import java.util.Scanner;
public class Ex014 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        float base,altura,area,perimetro;

        System.out.print("Digite a base e altura do retângulo: ");
        base = in.nextFloat();
        altura = in.nextFloat();

        area = (base * altura);
        perimetro = 2 * (base + altura);

        System.out.printf("A área do retângulo é %.1fcm e seu perímetro é %.1fcm. %n",area,perimetro);
    }
}