import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int homens, mulheres, criancas;
        double carne, total;

        System.out.print("Digite o número de homens, mulheres e crianças do churrasco: ");
        homens = in.nextInt();
        mulheres = in.nextInt();
        criancas = in.nextInt();

        carne = (homens*0.4) + (mulheres*0.32) + (criancas*0.2);
        total = (carne*1.2); // acrescentou 20% > 120% do valor da carne

        System.out.printf("De ver comprado %.1f kg de carne. %n",total);
    }
}