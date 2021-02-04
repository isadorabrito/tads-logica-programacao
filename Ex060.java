import java.util.Scanner;

public class Ex060 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int idade;

        System.out.print("Digite uma idade válida: ");
        idade = in.nextInt();

        while (idade <= 0 || idade >= 150) {
            System.out.println("Digite uma idade válida: ");
            idade = in.nextInt();
        }
        System.out.println(idade + " anos.");
    }
}