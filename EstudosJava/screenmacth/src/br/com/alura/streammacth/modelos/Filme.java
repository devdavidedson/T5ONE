package br.com.alura.streammacth.modelos;

import br.com.alura.streammacth.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (calcularMedia() / 2);
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + "(" + getAnoDeLancamento() + ")";
    }
}
