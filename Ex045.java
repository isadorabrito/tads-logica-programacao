import java.util.Scanner;
public class Ex045 {
    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);

       int usuario, senha;
       
       System.out.print("Digite seu usuario: ");
       usuario = in.nextInt();

        if (usuario != 1234) {
            System.out.println("Usuário Invalido");
        } else {
            System.out.print("Digite sua senha: ");
            senha = in.nextInt();
            if (senha != 9999) {
                System.out.println("Senha incorreta.");
            } else {
                System.out.println("Acesso permitido.");
            }
        }
    }
}