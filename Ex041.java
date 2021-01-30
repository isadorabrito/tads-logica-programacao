import java.util.Scanner;
public class Ex041 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1,n2,n3;

        System.out.print("Digite três valores: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
       
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.printf("Ordem crescente: %d > %d > %d. %n", n3, n2, n1);
            } else {
                System.out.printf("Ordem crescente: %d > %d > %d. %n", n2, n3, n1);
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.printf("Ordem crescente: %d > %d > %d. %n", n3, n1, n2);
            } else {
                System.out.printf("Ordem crescente: %d > %d > %d. %n", n1, n3, n2);
            }
        } else {
            if (n1 > n2) {
                System.out.printf("Ordem crescente: %d > %d > %d. %n", n2, n1, n3);
            } else {
                System.out.printf("Ordem crescente: %d > %d > %d. %n", n1, n2, n3);
            }
        } 
    }
}