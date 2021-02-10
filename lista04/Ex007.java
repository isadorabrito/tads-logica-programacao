import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cont, senha;
        cont = 1;

        System.out.print("Digite sua senha: ");
        senha = in.nextInt();

        while (senha != 12345) {
            System.out.print("Digite sua senha: ");
            senha = in.nextInt();
            cont++;
        }
        System.out.printf("%d tentativas até a senha correta.%n", cont);
    }
}