public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double ValorJuros = valor + 0.2;
        return super.saca(ValorJuros);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
