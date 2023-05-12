import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento do filme:");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite a avaliação do filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("Seu filme é:" + filme);
        System.out.println("O ano de lançamento dele é:" + anoDeLancamento);
        System.out.println("E sua avalição é: " + avaliacao);

    }
}
