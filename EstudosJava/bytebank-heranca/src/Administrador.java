public class Administrador extends Funcionario implements Autenticavel {

    private final VerificadorAcesso autenticador;

    public Administrador() {
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

    @Override
    public double getBonificacao() {
        return 50;
    }
}
