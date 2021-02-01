import java.util.Scanner;
public class Ex055 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char opcao;
        double saldo,saque,deposito;
        saldo = 0;

        System.out.println("Digite uma opção: \n\t(a) Consulta de saldo \n\t(b) saque \n\t(c) deposito \n\t(d) sair.");
        opcao = in.next().charAt(0);

        while (opcao!= 'd') {
            if (opcao == 'a') {
                System.out.printf("Seu saldo é R$ %.2f%n", saldo);
                System.out.println("Digite uma opção: \n\t(a) Consulta de saldo \n\t(b) saque \n\t(c) deposito \n\t(d) sair.");
                opcao = in.next().charAt(0);
            } else if (opcao == 'b') {
                System.out.print("Digite quanto você gostaria de sacar: R$ ");
                saque = in.nextDouble();
                saldo = saldo - saque;
                System.out.println("Digite uma opção: \n\t(a) Consulta de saldo \n\t(b) saque \n\t(c) deposito \n\t(d) sair.");
                opcao = in.next().charAt(0);
            } else if (opcao == 'c') {
                System.out.print("Digite quanto você gostaria de depositar: R$ ");
                deposito = in.nextDouble();
                saldo = saldo + deposito;
                System.out.println("Digite uma opção: \n\t(a) Consulta de saldo \n\t(b) saque \n\t(c) deposito \n\t(d) sair.");
                opcao = in.next().charAt(0);
            } else {
                System.out.println("Opção inválida.");
            }
        }
        System.out.println("FIM");
    }
}