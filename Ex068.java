import java.util.Scanner;
public class Ex068 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nempregados, horastrab, horatrabex, cont;
        float valorhora, pagbruto;

        cont = 1;

        System.out.print("Digite a quantidade de empregados que trabalham durante a semana: ");
        nempregados = in.nextInt();
        while (cont <= nempregados) {
            System.out.print("Digite o valor da sua hora: R$ ");
            valorhora = in.nextFloat();
            System.out.print("Digite o número de horas trabalhadas: ");
            horastrab = in.nextInt();
            if (horastrab <= 40) {
                pagbruto = valorhora * horastrab;
                System.out.printf("O valor do pagamento bruto ao funcionario %d é R$ %.2f reais.%n", cont, pagbruto);
            } else {
                horatrabex = (horastrab - 40);
                pagbruto = ((horatrabex * 1.5f * valorhora) + 40 * valorhora);
                System.out.printf("O valor do pagamento bruto ao funcionario %d é R$ %.2f reais.%n", cont, pagbruto);
            }
        cont++;
        }
    }
}