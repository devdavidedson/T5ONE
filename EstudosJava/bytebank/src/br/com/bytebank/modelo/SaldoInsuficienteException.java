package br.com.bytebank.modelo;

public class SaldoInsuficienteException extends Exception { //unchecked

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }

}
