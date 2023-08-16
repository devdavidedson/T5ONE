package br.com.bytebank.modelo;

public class CalculadoraImposto {
    private double totalImposto;
    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
