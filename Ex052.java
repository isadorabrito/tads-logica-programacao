import java.util.Scanner;
public class Ex052 {
   public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

      int n, numero, soma;

      numero = 1;
      soma = 0;

      System.out.print("Digite o valor de n: ");
      n = in.nextInt();

      while (numero <= n) {
      soma = soma + numero;
      numero++;
      }
      System.out.println(soma);
   }
}