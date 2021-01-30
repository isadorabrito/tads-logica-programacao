import java.util.Scanner;
public class Ex047 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sexo;
        float altura, pesoideal;

        System.out.print("Digite o seu sexo: [1]- Feminino [2]- Masculino: ");
        sexo = in.nextInt();
        System.out.print("Digite a sua altura: ");
        altura = in.nextFloat();

        if (sexo == 1) {
            pesoideal = 62.1f * altura - 44.7f;
            System.out.printf("Seu peso ideal é %.1f kg. %n", pesoideal);
        } else if (sexo == 2) {
            pesoideal = 72.7f * altura - 58f;
            System.out.printf("Seu peso ideal é %.1f kg. %n", pesoideal);
        } else {
            System.out.println("Erro. Digite 1 para Feminino ou 2 para Masculino");
        }
    }
}