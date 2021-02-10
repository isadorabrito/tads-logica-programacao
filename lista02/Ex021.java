import java.util.Scanner;
public class Ex021 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float comprimento, consumo, minlitros;
        int tvoltas,nreab,voltasreab;

        System.out.print("Digite o comprimento da pista (em metros): ");
        comprimento = in.nextFloat();
        System.out.print("Digite o número total de voltas e o número de reabastecimentos desejados: ");
        tvoltas = in.nextInt();
        nreab = in.nextInt();
        System.out.print("Digite o consumo do carro (em Km/L)");
        consumo = in.nextFloat();
        
        comprimento = comprimento *0.001f;
        voltasreab = tvoltas/nreab;
        minlitros = (voltasreab * consumo)/comprimento;
        
        System.out.printf("É necessário, no minimo, %.1f litros até o primeiro reabastecimento. %n", minlitros);
    }
}