package br.com.bytebank.modelo;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }
        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }

        Conta.total++;
        //System.out.println("O Total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public static int getTotal(){
        return Conta.total;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public abstract void deposita(double valor);

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public void menuInicial() {
        System.out.println("\n1- Sacar do saldo disponível em conta.");
        System.out.println("2- Depositar valor.");
        System.out.println("3- Verificar Saldo.");
        System.out.println("4- Sair.");
    }

    @Override
    public boolean equals(Object ref) {
        Conta conta = (Conta) ref;
        if (this.agencia != conta.agencia || this.numero != conta.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Numero: " + numero + " Agencia: " + agencia;
    }
}
