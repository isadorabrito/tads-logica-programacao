import java.util.Scanner;
public class Ex019 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);    
        
        float comprimento, largura,altura;
        int tcaixas;

        System.out.print("Digite as dimensões da cozinha (comprimento x largura x altura): ");
        comprimento = in.nextFloat();
        largura = in.nextFloat();
        altura = in.nextFloat();

        tcaixas = (int) (((comprimento*altura)*2 + (largura*comprimento)*2)/1.5f);
        System.out.println("Será necessário "+tcaixas+ " caixas de azulejos.");
    }
}