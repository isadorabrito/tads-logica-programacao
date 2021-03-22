import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] votacao = new int[99999];
        int[] candidato = new int[5];

        int voto = 0, vencedor = 0, nvencedor = 0;

        while (voto < votacao.length) {
            System.out.println("\t Candidado [1]\t Candidado [2]\t Candidado [3]\t Candidado [4]\t Candidado [5]");
            votacao[voto] = in.nextInt();

            if (votacao[voto] == -1) {
                break;
            }
            if (votacao[voto] >= 1 && votacao[voto] <= 5) {
                if (votacao[voto] == 1) {
                    candidato[0]++;
                } else if (votacao[voto] == 2) {
                    candidato[1]++;
                } else if (votacao[voto] == 3) {
                    candidato[2]++;
                } else if (votacao[voto] == 4) {
                    candidato[3]++;
                } else {
                    candidato[4]++;
                }
                voto++;
            } else {
                System.out.println("Opção incorreta. Candidatos de 1 a 5.");
            }
        }

        for (int i = 0; i < candidato.length; i++) {
            if (candidato[i] > vencedor) {
                vencedor = candidato[i];
                nvencedor = (i + 1);
            }
        }
        System.out.println("\t\t O candidato vencedor é o " + nvencedor + " com " + vencedor + " votos.");

    }
}