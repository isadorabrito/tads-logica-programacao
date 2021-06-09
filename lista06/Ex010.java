import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nlinhas, dobro; 

        System.out.print("Digite o numero de linhas: ");
        nlinhas = in.nextInt();
        dobro = (nlinhas * 2);

        for (int l = 1; l <= nlinhas; l++) {
            for (int a = 1; a < dobro ; a++) {
                System.out.print("*");
            }
            System.out.println(" ");
            dobro -= 2;
        }
    }
}