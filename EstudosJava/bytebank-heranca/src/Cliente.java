public class Cliente implements Autenticavel {

    private final VerificadorAcesso autenticador;

    public Cliente() {
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
}
