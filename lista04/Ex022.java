import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cont;
        float x, y, natx, naty;
        cont = 0;
        natx = 0;
        naty = 0;

        System.out.print("Digite o numero de habitantes do pais A: ");
        x = in.nextInt();
        System.out.print("Digite o numero de habitantes do pais B: ");
        y = in.nextInt();

        natx = x * 0.03f;
        naty = y * 0.02f;

        while (x < y) {
            x = x + natx;
            y = y + naty;
            cont++;
        }
        System.out.println("Para a população do pais A ultrapassar o pais B levara " + cont + " anos");
    }
}