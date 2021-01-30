import java.util.Scanner;
public class Ex042 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float lado1,lado2,lado3;

        System.out.print("Digite os três lados do triângulo: ");
        lado1 = in.nextFloat();
        lado2 = in.nextFloat();
        lado3 = in.nextFloat();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("É triângulo.");
        } else {
            System.out.println("Não é triângulo.");
        }
    }
}