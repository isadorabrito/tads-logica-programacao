import java.util.Scanner;

public class Ex064 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float nota1, nota2, nota3, menor, media;

        System.out.print("Digite suas três nota: ");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        nota3 = in.nextFloat();

        if (nota1 < nota2 || nota1 < nota3) {
            menor = nota1;
        } else if (nota2 < nota3 || nota2 < nota1) {
            menor = nota2;
        } else {
            menor = nota3;
        }
        media = (nota1 + nota2 + nota3 - menor) / 2;
        System.out.printf("A media foi %.1f.%n", media);
    }
}