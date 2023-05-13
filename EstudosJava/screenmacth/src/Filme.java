public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFilme() {
        System.out.println("Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " min");
    }

    void somaDasAvaliacoes(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double calcularMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
