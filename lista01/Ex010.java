import java.util.Scanner;
public class Ex010 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int socios,criancas,pagantes,publicototal;
        double ingresso,rendatotal,rendadescontada;


        System.out.print("Digite o valor do ingresso: ");
        ingresso = in.nextFloat();
        System.out.print("Digite o número de sócios, crianças e pagantes: ");
        socios = in.nextInt();
        criancas = in.nextInt();
        pagantes = in.nextInt();

        publicototal = socios + pagantes + criancas;
        rendatotal = pagantes*ingresso + ((socios*ingresso)*0.70);
        rendadescontada = socios*0.30 + criancas*ingresso;

        System.out.printf("O público total foi de %d pessoas. %n", publicototal);
        System.out.printf("A renda total foi R$ %.2f reais. %n", rendatotal);
        System.out.printf("A renda descontada foi de R$ %.2f reais. %n", rendadescontada);
    }
}