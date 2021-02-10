import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float nota1, nota2, opt, media;
        System.out.print("Digite suas duas notas: ");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        System.out.println("Digite sua nota na prova optativa (caso não tenha realizado, digite -1): " );
        opt = in.nextFloat();

        if (opt >= nota1) {
            nota1 = opt;
        } else if (opt >= nota2) {
            nota2 = opt;
        } else {
            System.out.println("Voce nao realizou a prova optativa ou sua nota não foi considerada.");;
        }
        media = (nota1 + nota2)/2;
        System.out.println("Sua média foi "+media);

        if (media >= 6) {
            System.out.println("Você esta aprovado.");
        } else if (media >= 3 && media < 6) {
            System.out.println("Você esta em exame.");
        } else {
            System.out.println("Você esta reprovado.");
        }
    }
}