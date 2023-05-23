package com.netflix.cliente;

public class Cliente {
    private String nome;
    private boolean contaAtiva = true;
    private String email;
    private String agente;

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getContaAtiva() {
        return this.contaAtiva;
    }
    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
    }
    public void exibeDadosAgente() {
        System.out.println("\n" + getAgente() + ": Pronto estou com sua conta, em que posso ajudar?\n");
    }

}
