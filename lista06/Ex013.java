import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x, y, anos;
        float natalidade_x, natalidade_y;

        System.out.print("Digite a população do país A: ");
        x = in.nextInt();
        System.out.print("Digite a população do país B: ");
        y = in.nextInt();

        natalidade_x = x * 0.03f;
        natalidade_y = y * 0.015f;

        for (anos = 0; x < y; anos++) {
            x += natalidade_x;
            y += natalidade_y;
        }
        System.out.println("Serão necessários " + anos + " anos.");
    }
}