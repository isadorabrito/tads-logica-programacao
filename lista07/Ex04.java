import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int paciente, idade;

        paciente = 100;

        System.out.println("\tPLANO DE SAUDE \nTabela de idades: \nDigite [1] para até 10 anos.\nDigite [2] para idade entre 10 e 30 anos.\nDigite [3] para idade entre 40 e 60 anos.\nDigite [4] para idade maior que 60 anos.");
        idade = in.nextInt();

        switch (idade) {
        case 1:
            paciente += 80;
            System.out.println("R$ " + paciente + " reais.");
            break;
        case 2:
            paciente += 50;
            System.out.println("R$ " + paciente + " reais.");
            break;
        case 3:
            paciente += 95;
            System.out.println("R$ " + paciente + " reais.");
            break;
        case 4:
            paciente += 130;
            System.out.println("R$ " + paciente + " reais.");
            break;
        default:
            System.out.println("Opção incorreta. [1 a 4].");
        }
    }
}