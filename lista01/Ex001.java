import java.util.Scanner;
public class Ex001 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int n,ant;

        System.out.print("Digite um número: ");
        n = in.nextInt();

        ant = (n -1);

        System.out.printf("Seu antecessor é %d. %n", ant);
    }  
}