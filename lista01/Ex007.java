import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float distancia,velocidade;
        int tempo;

        System.out.print("Digite a distância do trajeto(km): ");
        distancia = in.nextFloat();
        System.out.print("Digite a velocidade media da viagem(km/h): ");
        velocidade = in.nextFloat();

        tempo = (int) (distancia/velocidade);

        System.out.printf("Sua viagem levará %d hora(s). %n", tempo);
    }
}