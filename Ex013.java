import java.util.Scanner;
public class Ex013 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m,cm;
        System.out.print("Digite o valor em metros: ");
        m = in.nextInt();

        cm = m*100;
        System.out.printf("%d metro(s) são %d cm.%n",m,cm);
    }   
}