import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int horaini, horafim, tempojogo;

        System.out.print("Digite a hora de inicio da partida: ");
        horaini = in.nextInt();
        System.out.print("Digite a hora do fim da partida: ");
        horafim = in.nextInt();

        if (horafim > horaini) {
            tempojogo = horafim - horaini;
            System.out.println("O tempo de jogo foi " + tempojogo + " horas.");
        } else {
            tempojogo = (24 - horaini + horafim);
            System.out.println("O tempo de jogo foi " + tempojogo + " horas.");
        }
    }
}