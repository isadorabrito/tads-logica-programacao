import java.util.Scanner;
public class Ex049 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nlados;
        float lado, perimetro, area;

        System.out.print("Digite o número de lados do polígono: ");
        nlados = in.nextInt();
        System.out.print("Digite a medida do lado (em cm): ");
        lado = in.nextFloat();

        if (nlados == 3) {
            perimetro = lado + lado + lado;
            System.out.printf("TRIANGULO. Seu perimetro é %.1f cm. %n", perimetro);
        } else if (nlados == 4) {
            area = lado * lado;
            System.out.printf("QUADRADO. Sua área é %.1f cm. %n", area);
        } else if (nlados == 5) {
            System.out.println("PENTAGONO");
        } else if (nlados < 3) {
            System.out.println("NAO É UM POLIGONO");
        } else {
            System.out.println("POLIGONO NAO IDENTIFICADO");
        }
    }
}