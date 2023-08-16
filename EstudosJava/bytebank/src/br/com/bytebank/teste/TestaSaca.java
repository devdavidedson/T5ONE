package br.com.bytebank.teste;

import br.com.bytebank.modelo.*;

public class TestaSaca {

    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(250);
        try {
            conta.saca(260);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }

}
