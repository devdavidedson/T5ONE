public class Gerente extends Funcionario implements Autenticavel {

    private final VerificadorAcesso autenticador;

    public Gerente() {
        this.autenticador = new VerificadorAcesso();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }


}
