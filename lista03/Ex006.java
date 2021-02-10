import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String time1, time2;
        int gol1, gol2;

        System.out.print("Digite o nome do primeiro time: ");
        time1 = in.next();
        System.out.print("Digite o número de gols desse time na partida: ");
        gol1 = in.nextInt();
        System.out.print("Digite o nome do segundo time: ");
        time2 = in.next();
        System.out.print("Digite o número de gols desse time na partida: ");
        gol2 = in.nextInt();

        if (gol1 > gol2) {
            System.out.println(time1+" foi o vencedor. Parabens!");
        } else if (gol2 > gol1) {
            System.out.println(time2+" foi o vencedor. Parabens!");
        } else {
            System.out.println("O resultado foi empate.");
        }
    }
}