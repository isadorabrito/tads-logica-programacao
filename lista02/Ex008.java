import java.util.Scanner;
public class Ex008 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int teleitores,vbrancos,vnulos,vvalidos,pvalidos,pbrancos,pnulos;
        
        System.out.print("Digite o número de eleitores: ");
        teleitores = in.nextInt();
        System.out.print("Digite o número de votos válidos: ");
        vvalidos = in.nextInt();
        System.out.print("Digite o número de votos em branco: ");
        vbrancos = in.nextInt();
        System.out.print("Digite o número de votos nulos: ");
        vnulos = in.nextInt();

        pvalidos = (vvalidos*100)/teleitores;
        pbrancos = (vbrancos*100)/teleitores;
        pnulos = (vnulos*100) /teleitores;

        System.out.printf("O percentual de votos válidos foi %d%%. %nO percentual de votos brancos foi %d%%. %nE o percentual de votos nulos foi %d%%. %n", pvalidos, pbrancos, pnulos);
    }
}