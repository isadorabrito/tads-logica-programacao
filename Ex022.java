import java.util.Scanner;
public class Ex022 {
    public static void main (String[] args ) {
        
        Scanner in = new Scanner (System.in);

        int idade;

        System.out.println("Qual a sua idade?");
        idade = in.nextInt();

        if (idade >= 18) {
            System.out.println("Você esta na categoria adulto.");
        } else if (idade >=14 && idade <18) {
            System.out.println("Você esta na categoria juvenil.");
        }else if (idade >=9 && idade < 14) {
            System.out.println("Você está na categoria infantil.");
        } else {
            System.out.println("Você está na categoria mirim.");
        }
    }
}