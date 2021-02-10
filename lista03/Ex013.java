import java.util.Scanner;
public class Ex013 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nome;
        int quant;
        float preco, total, desc,totalapagar;

        System.out.print("Digite o nome do produto: ");
        nome = in.next();
        System.out.print("Digite a quantidade adquirida: ");
        quant = in.nextInt();
        System.out.print("Digite o preço unitário do produto: ");
        preco = in.nextFloat();

        total = quant * preco;

        if (quant <= 5) {
            desc = 0.02f;
        } else if (quant > 5 && quant <= 10) {
            desc = 0.03f;
        } else {
            desc = 0.05f;
        }

        totalapagar = total - (desc * total);

        System.out.printf("O total a pagar é R$ %.2f reais.%n", totalapagar);
    }
}