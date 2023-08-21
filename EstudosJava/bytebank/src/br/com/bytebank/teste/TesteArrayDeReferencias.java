package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsuficienteException;

import java.util.Collections;
import java.util.Objects;

public class TesteArrayDeReferencias {
    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente(324, 54523);
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(644, 53223);
        contas[1] = cc2;

        ContaCorrente ref = contas[1];

        System.out.println(contas[0].getAgencia());
        System.out.println(cc1.getAgencia());
        System.out.println(ref.getAgencia());

        for (Conta conta : contas) {
            if (conta == null) {
                System.out.println("Erro: Slot sem valor atribuído.");
            } else {
                System.out.println(conta);
            }
        }

    }
}
