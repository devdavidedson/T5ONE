package br.com.bytebank.teste;

import br.com.bytebank.especial.ContaEspecial;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(324, 55677);
        ContaPoupanca cp = new ContaPoupanca(221, 68795);
        ContaEspecial ce = new ContaEspecial(334, 32567);

        System.out.println(cc);
        System.out.println(cp);
        System.out.println(ce);

    }
}
