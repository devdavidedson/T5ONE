package br.com.bytebank.teste;

import br.com.bytebank.especial.ContaEspecial;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.ListaDeContas;

public class TesteGuardarConta {
    public static void main(String[] args) {

        ListaDeContas listaContas = new ListaDeContas();

        ContaCorrente cc = new ContaCorrente(234, 34356);
        ContaPoupanca cp = new ContaPoupanca(245, 12475);
        ContaEspecial ce = new ContaEspecial(756, 98564);

        listaContas.adiciona(cc);
        listaContas.adiciona(cp);
        listaContas.adiciona(ce);

        int tamanho = listaContas.getQuantidadeDeElementos();
        System.out.println("\nQuantidade de itens da Lista é: " + tamanho);

        Conta ref = listaContas.getReferencias(1);//posição na Lista para chamada no ref
        System.out.println(ref.getNumero());

    }
}
