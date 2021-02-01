import java.util.Scanner;
public class Ex056 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float media,nota;
        int cont;

        cont = 0;
        media = 0;  

        while (cont < 5) {
            System.out.print("Digite a próxima nota: ");
            nota = in.nextFloat();
            media = media + nota;
            cont++;
        }
        media = media/5;
        System.out.printf("Sua média é %.1f.%n", media);
    }
}