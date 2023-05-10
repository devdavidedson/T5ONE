public class Main {
    public static void main(String[] args) {
        System.out.println("Esté é o Stream Mach");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("O Ano de lançamento do filme é: " + anoDeLancamento);

        double notaFilme = 8.1;
        double media = (notaFilme + 9.1 + 6.1) /3 ;
        System.out.println("A Média do filme é: " + media);

        //Parte do código para sinopse!

        String sinopse;
        sinopse = """
                Top Gun Maverick:
                Filme muito bom, com galã dos anos 80
                ano de lançamento
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println("Média de estrelas é: " + classificacao);

    }
}