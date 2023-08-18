package br.com.bytebank.modelo;

public class ListaDeContas {

    private Conta[] referencias;
    private int posicaoNaLista;

    public ListaDeContas() {
        this.referencias = new Conta[10];
        this.posicaoNaLista = 0;
    }

    public void adiciona(Conta ref) {
        this.referencias[this.posicaoNaLista] = ref;
        this.posicaoNaLista++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoNaLista;
    }

    public Conta getReferencias(int pos) {
        return this.referencias[pos];
    }
}
