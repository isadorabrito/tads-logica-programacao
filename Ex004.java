import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float base, altura, area;

        System.out.print("Digite o valor da base e altura: ");
        base = in.nextFloat();
        altura = in.nextFloat();
                
        area = (base * altura)/2;

        System.out.printf("A área do triângulo é de %.2f cm. %n", area);
    }
}