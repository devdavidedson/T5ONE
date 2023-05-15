package br.com.alura.streammacth.calculos;

import br.com.alura.streammacth.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
