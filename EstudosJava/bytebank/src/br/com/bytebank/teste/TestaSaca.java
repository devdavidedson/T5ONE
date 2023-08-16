package br.com.bytebank.teste;

import br.com.bytebank.especial.ContaEspecial;
import br.com.bytebank.modelo.*;

public class TestaSaca {

    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123, 321);
        ContaEspecial ce = new ContaEspecial(122, 323123);

        ce.deposita(400);
        System.out.println(ce.getSaldo());

        conta.deposita(250);
        try {
            conta.saca(260);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Saldo insuficiente: " + ex.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());
    }

}
