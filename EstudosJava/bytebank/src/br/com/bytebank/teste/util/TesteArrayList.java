package br.com.bytebank.teste.util;

import br.com.bytebank.especial.ContaEspecial;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {

        //o sinal de <> é generics, dentro dela pode falar que a classe
        //generica é do tipo Conta!
        List<Conta> lista = new ArrayList<>();

        ContaCorrente cc = new ContaCorrente(23, 343);
        ContaPoupanca cp = new ContaPoupanca(24, 124);
        ContaEspecial ce = new ContaEspecial(75, 985);
        lista.add(cc);
        lista.add(cp);
        lista.add(ce);
        System.out.println("Tamanho: " + lista.size());

        Conta ref = lista.get(1);

        System.out.println(ref.getAgencia());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        System.out.println("Tamanho: " + lista.size());

        for(int i = 0; i < lista.size(); i++) {
            Conta conta = lista.get(i);
            System.out.println(conta);
        }
        System.out.println("--------------------------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
