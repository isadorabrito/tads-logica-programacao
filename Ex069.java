import java.util.Scanner;

public class Ex069 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cont = 1;
        int idade = 1;
        int maiorid = 0;
        int menorid = 200;
        int somaid = 0;
        int media = 0;

        while (idade != 0) {
            System.out.print("Digite a idade da " + cont + " pessoa ou zero para sair: ");
            idade = in.nextInt();
            if (idade == 0) {
                break;
            }
            somaid = somaid + idade;
            if (maiorid < idade) {
                maiorid = idade;
            }
            if (menorid > idade) {
                menorid = idade;
            }
            media = somaid / cont;
            cont++;
        }
        cont--;
        System.out.println("Numero de pessoas: " + cont);
        System.out.println("A media entre as idades é " + media);
        System.out.println("A menor idade é " + menorid);
        System.out.println("A maior idade é " + maiorid);
    }
}