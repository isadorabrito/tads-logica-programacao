import java.util.Scanner;

public class Ex077 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int v, v1, v2, v3, vb, vn, total;
        String vencedor;

        v1 = 0;
        v2 = 0;
        v3 = 0;
        vb = 0;
        vn = 0;
        v = 0;

        while (v >= 0) {
            System.out.println(
                    "Digite seu voto: \n\t[1] para candidato 1 \n\t[2] para candidato 2 \n\t[3] para candidato 3 \n\t[4] para branco \n\t[5] para nulo. \n\t[-1] para sair.");
            v = in.nextInt();
            if (v == 1) {
                v1++;
            } else if (v == 2) {
                v2++;
            } else if (v == 3) {
                v3++;
            } else if (v == 4) {
                vb++;
            } else if (v == 5) {
                vn++;
            } else {
                System.out.println("FIM");
            }
        }
        if (v1 > v2 && v1 > v3) {
            vencedor = "1";
        } else if (v2 > v3 && v2 > v1) {
            vencedor = "2";
        } else {
            vencedor = "3";
        }
        total = v1 + v2 + v3 + vb + vn;
        System.out.println("O vencedor é o candidato " + vencedor);
        System.out.println("Numero de votos em branco: " + vb);
        System.out.println("Numero de votos nulos: " + vn);
        System.out.println("Numero de eleitores que compareceram as urnas: " + total);
    }
}