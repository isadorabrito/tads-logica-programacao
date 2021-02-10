import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ianos,imeses,idias,totaldias;

        System.out.print("Digite a sua idade em anos,meses e dias: ");
        ianos = in.nextInt();
        imeses = in.nextInt();
        idias = in.nextInt();

        totaldias = idias + (imeses*30) + (ianos*365);
        
        System.out.println("Você viveu "+totaldias+" dias até hoje.");
    }
}