package br.com.bytebank.teste;

import br.com.bytebank.modelo.*;

public class TesteBankCCCP {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(1122, 11220003);
        ContaPoupanca cp = new ContaPoupanca(1133, 11330002);

        cc.transfere(50, cp);
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
