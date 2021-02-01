import java.util.Scanner;
public class Ex061 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float salario;

        System.out.print("Digite seu salário: R$ ");
        salario = in.nextFloat();

        while (salario <= 0) {
            System.out.print("Digite um salário válido: R$ ");
            salario = in.nextFloat();
        }
        System.out.printf("R$ %.2f reais.%n", salario);
    }
}