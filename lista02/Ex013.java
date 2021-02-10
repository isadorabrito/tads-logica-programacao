import java.util.Scanner;
public class Ex013 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float nota1,nota2,media;

        System.out.print("Digite suas duas notas: ");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();

        media = (nota1 + nota2)/2;

        if (media >=6) {
            System.out.println("Voce foi aprovado! Sua media foi "+media);
        } else {
            System.out.println("Voce foi reprovado.");
        }
    }
}