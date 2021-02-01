import java.util.Scanner;
public class Ex053 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n,numero,soma;

        numero = 2;
        soma = 0;

        System.out.print("Digite um valor para n: ");
        n = in.nextInt();
        
        while (numero <= n) {
            if (numero %2 == 0) {
            soma = numero + soma;
            }  
        numero++;       
        }
        System.out.println("Soma: "+ soma);
    }
}