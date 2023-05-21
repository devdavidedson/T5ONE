package com.netflix.operadores;

public class Operadores {
    private String apresentacao = """
            *****************************************
            
            O Cliente está ligando...
            Cliente se apresenta e informa seus dados
            
            *****************************************
            """;
    private String dadosDoCliente;
    private int resposta = 0;

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public String getApresentacao() {
        return apresentacao;
    }
}
