import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int idade = 1;
        int cont = 0;
        int media = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (idade != 0) {
            idade = in.nextInt();
            if (idade == 0) {
                break;
            }
            media += idade;
            if (menor > idade) {
                menor = idade;
            }
            if (maior < idade) {
                maior = idade;
            }
            cont++;
        }
        media = media / cont;
        System.out.println("Numero de pessoas: " + cont);
        System.out.println("A media entre as idades é " + media);
        System.out.println("A menor idade é " + menor);
        System.out.println("A maior idade é " + maior);
    }
}