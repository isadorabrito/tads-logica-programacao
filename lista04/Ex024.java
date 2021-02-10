import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nome, arroba, nomepeso, nomealtura;
        char sexo;
        int idade, cont, idadestotal;
        float mediaidade, pesofem, alturamasc, maiorpesofem, maioralturamasc;

        arroba = "@";
        cont = 0;
        maiorpesofem = 0;
        maioralturamasc = 0;
        idadestotal = 0;
        nomealtura = "";
        nomepeso = "";

        System.out.print("Digite seu nome: ");
        nome = in.next();

        while (!nome.equals(arroba)) {
            System.out.print("Digite seu sexo: [f] para feminino e [m] para masculino ");
            sexo = in.next().charAt(0);
            System.out.print("Digite a sua idade: ");
            idade = in.nextInt();
            idadestotal = idadestotal + idade;
            if (sexo == 'f') {
                System.out.print("Digite o seu peso: ");
                pesofem = in.nextFloat();
                if (pesofem > maiorpesofem) {
                    maiorpesofem = pesofem;
                    nomepeso = nome;
                }
            } else {
                System.out.print("Digite sua altura: ");
                alturamasc = in.nextFloat();
                if (alturamasc > maioralturamasc) {
                    maioralturamasc = alturamasc;
                    nomealtura = nome;
                }
            }
            System.out.print("Digite o nome do atleta ou @ para sair: ");
            nome = in.next();
            cont++;
        }
        mediaidade = (float) idadestotal / cont;
        System.out.println("A media entre as idades é " + mediaidade);
        System.out.println("A atleta mais pesada é a " + nomepeso + " com " + maiorpesofem + " kg.");
        System.out.println("O atleta mais alto é o " + nomealtura + " com " + maioralturamasc + " metros.");
    }
}