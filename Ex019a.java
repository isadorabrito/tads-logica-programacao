import java.util.Scanner;
public class Ex019a {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int horast;
        float salariohora,totalsalario;
        double salarioliq,desc;

        System.out.print("Digite seu salário por hora: ");
        salariohora = in.nextFloat();
        System.out.print("Digite o número de horas trabalhadas: ");
        horast = in.nextInt();
        System.out.print("Digite a porcentagem descontada: ");
        desc = in.nextDouble();

        totalsalario = salariohora * horast;
        salarioliq = totalsalario * (desc/100);

        System.out.printf("Seu salário do mês será de R$ %.2f reais. %n", totalsalario);
        System.out.printf("E seu salário líquido será R$ %.2f reais. %n",salarioliq);
    }
}