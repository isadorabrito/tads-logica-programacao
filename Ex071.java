import java.util.Scanner;
public class Ex071 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;

        int cont = 1;
        int aux = 1;

        System.out.print("Digite o tamanho do lado (entre 1 e 20): ");
        n = in.nextInt();

        while (cont <= n) {  
            while (aux < n) {
            System.out.print("* ");
            aux++;
            }
        System.out.println("*"); 
        cont++;
        aux = 1;
        }
    } 
}