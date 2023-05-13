public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.nome = "Milagre da cela 5";
        filme1.anoDeLancamento = 2018;
        filme1.duracaoEmMinutos = 185;

        filme1.exibeFilme();

        filme1.somaDasAvaliacoes(8);
        filme1.somaDasAvaliacoes(10);
        filme1.somaDasAvaliacoes(6);

        System.out.println("A nota do filme é: " + filme1.calcularMedia());

    }
}
