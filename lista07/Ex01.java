import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int dia;

        System.out.print("Digite o dia: ");
        dia = in.nextInt();

        switch(dia) {
            case 1: 
            System.out.println("Domingo. \nFim de Semana!");
            break;
            case 2:
            System.out.println("Segunda-feira. \nDia útil!");
            break;
            case 3:
            System.out.println("Terça-feira. \nDia útil!");
            break;
            case 4:
            System.out.println("Quarta-feira. \nDia útil!");
            break;
            case 5:
            System.out.println("Quinta-feira. \nDia útil!");
            break;
            case 6:
            System.out.println("Sexta-feira. \nDia útil!");
            break;
            case 7:
            System.out.println("Sábado. \nFim de Semana!");
            break;
            default:
            System.out.println("Dia inválido.");
        }


    }    
}