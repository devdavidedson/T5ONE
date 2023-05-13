import br.com.alura.streammacth.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Milagre da cela 5");
        filme1.setAnoDeLancamento(2018);
        filme1.setDuracaoEmMinutos(185);

        filme1.exibeFilme();

        filme1.somaDasAvaliacoes(8);
        filme1.somaDasAvaliacoes(10);
        filme1.somaDasAvaliacoes(6);

        System.out.println("A nota do filme é: " + filme1.calcularMedia());
        System.out.println("br.com.alura.streammacth.modelos.Filme Avaliado por: " + filme1.getTotalDeAvaliacoes() + " usuários");

    }
}
