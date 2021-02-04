import java.util.Scanner;

public class Ex074 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cont, tempo;
        float massa, perda;

        cont = 0;
        perda = 0;

        System.out.print("Qual a massa desse material(em gramas): ");
        massa = in.nextFloat();

        while (massa >= 0.10f) {
            perda = massa * 0.75f;
            massa = massa - perda;
            cont++;
        }
        tempo = cont * 30;
        System.out.printf(
                "O tempo necessário para que a massa desse material se torne menor que 0,10 gramas é %d segundos.%n",
                tempo);
    }
}