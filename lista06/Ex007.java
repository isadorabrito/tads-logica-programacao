import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nfuncionarios, m=0 ,f=0;
        float salario = 0,maiormasc = 0, maiorfem = 0, mediaf = 0,mediam = 0,mediafem,mediamasc;
        String nome;
        char genero;

        System.out.println("Digite o numero de funcionarios: ");
        nfuncionarios = in.nextInt();

        for (int i=1; i <= nfuncionarios; i++) {

        System.out.println("Digite seu nome:");
        nome = in.next();

        System.out.println("Digite seu gênero [f] ou [m]: ");
        genero = in.next().charAt(0);

        if (genero == 'f') {
            System.out.println("Digite seu salário: ");
            salario = in.nextFloat();
            if (salario > maiorfem) {
                maiorfem = salario;
            }
            f++;
            mediaf += salario;
        } else if (genero == 'm') {
            System.out.println("Digite seu salário: ");
            salario = in.nextFloat();
            if (salario > maiormasc) {
            maiormasc = salario;
            }
            m++;
            mediam += salario;
        } else {
            System.out.println("Opção incorreta. Digite f para feminino ou m para masculino.");
            i--;
        }
    }
        mediamasc = mediam/m;
        mediafem = mediaf/f;

        System.out.println("Maior salário masculino é R$ " + maiormasc);
        System.out.println("Maior salário feminino é R$ " + maiorfem);
        System.out.println("A média salarial masculina é R$ " + mediamasc);
        System.out.println("A média salarial feminina é R$ " + mediafem);
        
    }
}