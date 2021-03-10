import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int matricula = 1;
        int idade;
        float altura;
        boolean concursado;
        char genero;

        int totalFemConcursada = 0;
        int totalHomens = 0;
        int concursadoMaisVelho = 0;
        int mulheres30SemConcurso = 0;
        int totalConcursados = 0;

        int tHomensMenos40 = 0;
        float somaAlturasHomens = 0;
        float mediaAlturaHomensMenos40;

        while (matricula != 0) {

            System.out.print("Digite sua matricula: ");
            matricula = in.nextInt();

            if (matricula == 0) {
                break;
            }

            System.out.print("Digite seu gênero: ");
            genero = in.next().charAt(0);

            System.out.print("Digite a sua altura: ");
            altura = in.nextFloat();

            System.out.print("Digite sua idade: ");
            idade = in.nextInt();

            System.out.print("Digite se você é concursado: ");
            concursado = in.nextBoolean();

            if (genero == 'f') {
                if (concursado == true) {
                    totalFemConcursada++;

                } else {
                    if (idade > 30) {
                        mulheres30SemConcurso++;
                    }
                }
            }

            if (genero == 'm') {
                totalHomens++;

                if (idade < 40) {
                    tHomensMenos40++;
                    somaAlturasHomens += altura;
                }
            }

            if (genero == 'm' && concursado) {
                if (idade > concursadoMaisVelho) {
                    concursadoMaisVelho = idade;
                }
            }

            if (concursado) {
                totalConcursados++;
            }
        }

        mediaAlturaHomensMenos40 = somaAlturasHomens / tHomensMenos40;

        System.out.println("Número de funcionárias concursadas: " + totalFemConcursada);
        System.out.println("Número de funcionários concursados: " + totalHomens);
        System.out.println("Maior idade dos homens concursados: " + concursadoMaisVelho);
        System.out.println("Quantidade de mulheres com mais de 30 anos sem concurso: " + mulheres30SemConcurso);
        System.out.println("Quantidade de concursados: " + totalConcursados);
        System.out.println("A média das alturas dos homens com menos de 40 anos é " + mediaAlturaHomensMenos40);
    }
}