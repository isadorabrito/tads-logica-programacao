import java.util.Scanner;
public class Ex059 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float valorcada,valortotal,media;
        int nmercadorias, cont;

        cont = 1;
        valortotal = 0;

        System.out.print("Digite o número total de mercadorias no estoque: ");
        nmercadorias = in.nextInt();

        while (cont <= nmercadorias) {
            System.out.print("Digite o valor de cada mercadoria: R$ ");
            valorcada = in.nextFloat();
            valortotal = valortotal + valorcada;
            cont++;
        }

        media = valortotal/nmercadorias;
        System.out.printf("O valor total em estoque é R$ %.2f.%n", valortotal);
        System.out.printf("A media dos valores das mercadorias é %.1f.%n", media);
    }
}