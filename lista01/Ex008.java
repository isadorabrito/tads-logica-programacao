import java.util.Scanner;
public class Ex008 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int total, validos, brancos, nulos;
        int pvalidos,pbrancos,pnulos;
        
        System.out.print("Digite o número de eleitores: ");  
        total = in.nextInt();
        System.out.print("Digite o número de votos válidos: ");
        validos = in.nextInt();
        System.out.print("Digite o número de votos em branco: ");
        brancos = in.nextInt();
        System.out.print("Digite o número de votos nulos: ");
        nulos = in.nextInt();

        pvalidos = (validos*100)/total;
        pbrancos = (brancos*100)/total;
        pnulos = (nulos*100)/total;

        System.out.printf("A porcertagem de votos válidos foi %d%% %n" ,pvalidos);
        System.out.printf("A porcertagem de votos em branco foi %d%% %n" ,pbrancos);
        System.out.printf("A porcertagem de votos nulos foi %d%% %n" ,pnulos);
    }
}