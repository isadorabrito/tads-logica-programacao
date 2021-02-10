import java.util.Scanner;
public class Ex020 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float iniodometro,fimodometro,litroscomb,tvalor,mediaconsumo,lucro,comb;

        System.out.print("Digite a marcação do odômetro no inicio e fim do dia: ");
        iniodometro = in.nextFloat();
        fimodometro = in.nextFloat();
        System.out.print("Digite o número de litros de combustivel gasto: ");
        litroscomb = in.nextFloat();
        System.out.print("Digite o valor total recebido dos passageiros: ");
        tvalor = in.nextFloat();

        comb = 4.599f;
        mediaconsumo = (fimodometro - iniodometro)/(litroscomb);
        lucro = tvalor - (comb*litroscomb);

        System.out.printf("A média de consumo é %.1f Km/L. %n", mediaconsumo);
        System.out.printf("O lucro é de R$ %.2f reais por dia.%n", lucro);
    }
}