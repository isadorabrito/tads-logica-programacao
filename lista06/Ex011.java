import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nlinhas, ncolunas;

        System.out.println("Digite o numero de linhas e colunas: ");
        nlinhas = in.nextInt();
        ncolunas = in.nextInt();

        for (int l = 0; l < nlinhas; l++) {
            for (int c = 0; c < ncolunas; c++) {

                if (l == 0 || l == nlinhas - 1) {
                    System.out.print("-");

                } else if (c == 0 || c == ncolunas - 1) {
                    System.out.println("|");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}