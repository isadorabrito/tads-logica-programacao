import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int matricula = 1, idade, maior = 0, h = 0, f = 0;
        int i = 0, fh = 0, fm = 0, qf = 0, sm = 0;
        char sexo, concursado;
        float altura, somaalt = 0, maltura = 0;

        while (matricula != 0) {

            System.out.print("Digite sua matricula: ");
            matricula = in.nextInt();

            if (matricula == 0) {
                break;
            }

            System.out.print("Digite seu gênero: ");
            sexo = in.next().charAt(0);

            if (sexo == 'm') {
                System.out.println("Digite a sua altura: ");
                altura = in.nextFloat();
                if (altura < 40) {
                    somaalt = (somaalt + altura);
                    sm++;
                }
                System.out.println("Digite se você é concursado: [s] ou [n]: ");
                concursado = in.next().charAt(0);
                if (concursado == 's') {
                    System.out.print("Digite sua idade: ");
                    idade = in.nextInt();
                    if (idade > maior) {
                        maior = idade;
                    }
                    fh++;
                }
                h++;
            } else if (sexo == 'f') {
                System.out.println("Digite se você é concursado: [s] ou [n]: ");
                concursado = in.next().charAt(0);
                if (concursado == 'n') {
                    System.out.print("Digite sua idade: ");
                    idade = in.nextInt();
                    if (idade > 30) {
                        i++;
                    }
                } else if (concursado == 's') {
                    fm++;
                }
                f++;
            } else {
                System.out.println("gênero não identificado. Digite [f] ou [m]: ");
            }
            qf = fh + fm;
            maltura = somaalt / sm;

        }
        System.out.println("número de funcionárias concursadas: " + f);
        System.out.println("número de funcionários concursados: " + h);
        System.out.println("Maior idade dos homens concursados: " + maior);
        System.out.println("Quantidade de mulheres com mais de 30 anos sem concurso: " + i);
        System.out.println("Quantidade de concursados: " + qf);
        System.out.println("A média das alturas dos homens com menos de 40 anos é " + maltura);
    }
}