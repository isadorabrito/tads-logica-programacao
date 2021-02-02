import java.util.Scanner;
public class Ex067 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int base, exp, pot, a;

        System.out.print("Digite o valor da base: ");
        base = in.nextInt();
        System.out.print("Digite o valor do expoente: ");
        exp = in.nextInt();

        a = 1;
        pot = base;

        while (a < exp) {
            pot = pot*base;
            a++;     
        }   
        System.out.println("O resultado da potencia é "+pot);
    }
}