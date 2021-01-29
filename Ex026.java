import java.util.Scanner;
public class Ex026 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int anoatual,anonasc,idade;

        System.out.print("Em que ano estamos? ");
        anoatual = in.nextInt();
        System.out.print("Qual ano do seu nascimento? ");
        anonasc = in.nextInt();

        idade = anoatual - anonasc;

        if (idade>=16) {
            System.out.println("Voce pode votar este ano.");
        } else {
            System.out.println("Voce nao pode votar este ano.");
        }
    }
}