import java.util.Scanner;
public class Ex035 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int estoqueatual,estoquemin,estoquemax,qmedia;

        System.out.print("Digite a quantidade atual do estoque: ");
        estoqueatual = in.nextInt();
        System.out.print("Digite a quantidade minima e maxima em estoque do produto: ");
        estoquemin = in.nextInt();
        estoquemax = in.nextInt();

        qmedia = (estoquemax + estoquemin)/2;

        System.out.println("A quantidade média de estoque é "+qmedia);

        if (estoqueatual >= qmedia) {
            System.out.println("Nao efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}