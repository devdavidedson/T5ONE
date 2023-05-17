package br.com.alura.streammacth.calculos;

import br.com.alura.streammacth.modelos.Filme;
import br.com.alura.streammacth.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Titulo titulo) {
        System.out.println("Adicionado duração de minutos do " + titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
