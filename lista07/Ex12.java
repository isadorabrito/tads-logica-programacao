import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float valor;
        int pessoa;

        System.out.print("Digite o valor da compra: ");
        valor = in.nextFloat();
        System.out.print("Digite o valor da compra [1 - cliente comum] [2 - funcionario] [ 3 - vip]: ");
        pessoa = in.nextInt();

        switch (pessoa) {
        case 1:
            System.out.printf("Valor total da valor: R$ %.2f reais %n", valor);
            break;
        case 2:
            valor -= valor * 0.10f;
            System.out.printf("Valor total da valor: R$ %.2f reais %n", valor);
            break;
        case 3:
            valor -= valor * 0.05f;
            System.out.printf("Valor total da valor: R$ %.2f reais %n", valor);
            break;
        default:
            System.out.println("Opção inválida.");
        }
    }
}