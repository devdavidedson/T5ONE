//é um contrato chamado Autenticavel
    //quem assinar precisa implementar
        //metodo setSenha
        //metodo autentica

public interface Autenticavel {

    void setSenha(int senha);

    boolean autentica(int senha);

}
