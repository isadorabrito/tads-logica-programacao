import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 0;
        String repeticao = "Sim";

        while (repeticao.equals("Sim")) {

        System.out.print("Digite um número inteiro positivo: ");
        n = in.nextInt();

            if (n > 0) {
                System.out.println("Numero digitado: " + n);
                System.out.print("Numero pares entre 1 e " + n + ": ");
                for (int i = 1; i < n; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i +"; ");
                    }
                }

            } else {
                System.out.println("Valor incorreto!");
            }

            System.out.println("\nDeseja repetir a operação? [Sim] [Nao]");
            repeticao = in.next();

        }
    }
}
