import java.util.Scanner;
public class Ex016 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float salario,emprestimo,valorprest;
        int nprestacoes;

        System.out.print("Digite o seu salário: R$ ");
        salario = in.nextFloat();
        System.out.print("Digite o valor do seu empréstimo: R$ ");
        emprestimo = in.nextFloat();
        System.out.print("Digite o número de prestações: ");
        nprestacoes = in.nextInt();

        valorprest = emprestimo/nprestacoes;

        if (valorprest < salario*0.3) {
            System.out.println("Voce pode tirar o emprestimo.");
        }else {
            System.out.println("Voce nao pode tirar o emprestimo.");
        }
    }
}