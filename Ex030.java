import java.util.Scanner;
public class Ex030 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ncarros;
        float tvendas,salariofixo,salariocarro,salario;

        System.out.print("Digite o número de carros vendidos: ");
        ncarros = in.nextInt();
        System.out.print("Digite o valor total de suas vendas: R$ ");
        tvendas = in.nextFloat();
        System.out.print("Digite seu salário fixo: R$ ");
        salariofixo = in.nextFloat();
        System.out.print("Digite seu salário por carro vendido: R$ ");
        salariocarro = in.nextFloat();

        salario = salariofixo + (salariocarro*ncarros) + (tvendas*0.05f);
        System.out.printf("Seu salário final é R$ %.2f reais.%n", salario);
    }
}