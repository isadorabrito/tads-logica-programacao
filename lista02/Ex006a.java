import java.util.Calendar;
import java.util.Scanner;
public class Ex006a {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int anonasc,mesnasc,dianasc,idadeanos,idademeses,idadedias;

        Calendar datanasc = Calendar.getInstance();

        System.out.println("Digite sua data de nascimento: ");
        dianasc = in.nextInt();
        mesnasc = in.nextInt();
        anonasc = in.nextInt();

        datanasc.set (anonasc,mesnasc,dianasc);
        
        Calendar hoje = Calendar.getInstance();

        System.out.println("\nMeu ano de nascimento: " +datanasc.get(Calendar.YEAR));
        System.out.println("Meu mês de nascimento: " +datanasc.get(Calendar.MONTH));
        System.out.println("Meu dia de nascimento: " +datanasc.get(Calendar.DAY_OF_MONTH));

        System.out.println("\nAno em que estamos: " +hoje.get(Calendar.YEAR));
        System.out.println("Mês em que estamos: " +hoje.get(Calendar.MONTH) +1);
        System.out.println("Dia em que estamos: " +hoje.get(Calendar.DAY_OF_MONTH));


        idadeanos = hoje.get(Calendar.YEAR) - datanasc.get(Calendar.YEAR);
        idademeses = hoje.get(Calendar.MONTH) - datanasc.get(Calendar.MONTH) + (idadeanos * 12) +1;
        idadedias = hoje.get(Calendar.DAY_OF_MONTH) - datanasc.get(Calendar.DAY_OF_MONTH) + (idademeses*30);

        if (mesnasc > hoje.get(Calendar.MONTH)) {
            idadeanos--;
        }

        System.out.println("\nSua idade em anos é "+idadeanos);
        System.out.println("Sua idade em meses é "+idademeses);
        System.out.println("Sua idade em dias é "+idadedias);     
    }
}