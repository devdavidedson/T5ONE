public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1986;
        boolean membroVip = false;
        String tipoPlano = "normal";

        /* if (anoDeLancamento >= 2022) {
            System.out.println("Filme curtido pelos membros como lançamento!");
        } else {
            System.out.println("Filme retrô porém muito bom!");
        } */

        if (membroVip || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Pague o aluguel!");
        }

    }
}
