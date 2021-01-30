import java.util.Scanner;
public class Ex051 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float nota1, nota2, nota3, media;

        System.out.print("Digite suas três notas: ");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        nota3 = in.nextFloat();

        media = (nota1 + nota2 + nota3)/3;
        System.out.printf("Sua media é %.1f %n", media);

        if (media >= 9) {
            System.out.println("Conceito A");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Conceito B");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Conceito D");
        }
    }
}