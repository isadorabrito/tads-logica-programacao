import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor;
        int nota100 = 0, nota50 = 0, nota10 = 0, nota5 = 0, nota1 = 0;

        System.out.print("Digite o valor do produto: R$ ");
        valor = in.nextInt();

        while (valor != 0) {
            nota100 = valor / 100;
            valor %= 100;
            nota50 = valor / 50;
            valor %= 50;
            nota10 = valor / 10;
            valor %= 10;
            nota5 = valor / 5;
            valor %= 5;
            nota1 = valor / 1;

            System.out.println(nota100 + " notas de 100.");
            System.out.println(nota50 + " notas de 50.");
            System.out.println(nota10 + " notas de 10.");
            System.out.println(nota5 + " notas de 5.");
            System.out.println(nota1 + " notas de 1.");

            System.out.print("Digite o valor do produto ou 0 para sair: R$ ");
            valor = in.nextInt();
        }
    }
}