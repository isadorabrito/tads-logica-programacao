import java.util.Scanner;
public class Ex012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float nota;

        System.out.print("Digite a sua nota: ");
        nota = in.nextFloat();

        if (nota >= 7) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else {
            System.out.println("Você está em recuperação.");
        }
    }
}