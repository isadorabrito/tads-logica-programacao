import java.util.Scanner;
public class Ex072 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int mediapar, mediaimpar;
        int valor = 1;
        int somapar = 0;
        int somaimpar=0;
        int maiorpar = 0;
        int menorimpar = Integer.MAX_VALUE;
        int p = 0;
        int i = 0;

        while(valor >= 0) {
        System.out.print("Digite um valor: ");
        valor = in.nextInt();
        if (valor < 0) {
            break;
        }
        if (valor%2 == 0) {
            somapar = somapar + valor;
            p++;
            if (valor > maiorpar) {
            maiorpar = valor;
        }
        } else {
        somaimpar = somaimpar + valor;
        i++;
            if (valor < menorimpar) {
            menorimpar = valor;
            }
        }
        }
        if (i == 0) {
            System.out.println("Nenhum numero impar\nmedia impar: 0");
        } else {
            mediaimpar = somaimpar/i;
            System.out.println("media impar: "+mediaimpar);
            System.out.println("menor impar: "+menorimpar);
        }
        if (p == 0) {
            System.out.println("Nenhum numero par\nmedia par: 0");
        } else {
            mediapar = somapar/p;
            System.out.println("media par: "+mediapar);
            System.out.println("maior par: "+maiorpar);
        }
    }
}