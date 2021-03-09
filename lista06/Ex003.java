import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float peso, altura = 1, imc;
        int abaixopeso = 0, normal = 0, sobrepeso = 0, obesidadeum = 0, obesidadedois = 0, obesidadetres = 0;

        while (altura > 0) {
            System.out.println("Digite sua altura:");
            altura = in.nextFloat();
            if (altura <= 0) {
                break;
            }

            System.out.println("Digite seu peso: ");
            peso = in.nextFloat();

            imc = peso / (altura * altura);

            if (imc < 18.5) {
                abaixopeso++;
            } else if (imc >= 18.5 && imc <= 24.9) {
                normal++;
            } else if (imc >= 25 && imc <= 29.9) {
                sobrepeso++;
            } else if (imc >= 30 && imc <= 34.9) {
                obesidadeum++;
            } else if (imc >= 35 && imc <= 35.9) {
                obesidadedois++;
            } else {
                obesidadetres++;
            }
        }
        System.out.println(abaixopeso + " pessoas abaixo do peso;");
        System.out.println(normal + " pessoas com peso saudável;");
        System.out.println(sobrepeso + " pessoas com sobrepeso;");
        System.out.println(obesidadeum + " pessoas com obesidade grau I;");
        System.out.println(obesidadedois + " pessoas com obesidade grau II;");
        System.out.println(obesidadetres + " pessoas com obesidade grau III.");
    }
}