import java.util.Scanner;

public class ModeloProva0102 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int angulo1, angulo2, angulo3;
        System.out.print("Digite os três angulos: ");
        angulo1 = in.nextInt();
        angulo2 = in.nextInt();
        angulo3 = in.nextInt();

        if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            System.out.println("Triangulo Obtusangulo");
        } else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("Triangulo Retangulo");
        } else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
            System.out.println("Triangulo Acutangulo");
        } else {
            System.out.println("Opção não valida");
        }
    }
}