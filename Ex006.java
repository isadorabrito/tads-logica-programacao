import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float nota1,nota2,media;

        System.out.print("Digite suas duas notas: ");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();

        media = (nota1 + nota2)/2;

        System.out.println("Sua media foi " +media);
    }
}
