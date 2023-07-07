
public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O Total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
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
    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public abstract void deposita(double valor);

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public void menuInicial() {
        System.out.println("\n1- Sacar do saldo disponível em conta.");
        System.out.println("2- Depositar valor.");
        System.out.println("3- Verificar Saldo.");
        System.out.println("4- Sair.");
    }

}
