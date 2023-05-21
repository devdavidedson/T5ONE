package com.netflix.cliente;

public class Cliente {
    private String nome;
    private boolean contaAtiva = true;
    private String email;

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

    public void exibeDados () {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
    }

}
