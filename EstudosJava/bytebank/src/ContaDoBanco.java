import java.util.Random;


public class ContaDoBanco {
    private double saldo;
    private int agencia;
    private int numeroDaConta;
    DadosPessoais titular = new DadosPessoais();


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void menuInicial() {
        System.out.println("\n1- Sacar do saldo disponível em conta.");
        System.out.println("2- Depositar valor.");
        System.out.println("3- Verificar Saldo.");
        System.out.println("4- Sair.");
    }

}
