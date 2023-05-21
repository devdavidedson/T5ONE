package com.netflix.cliente;

public class Cliente {
    private String nome;
    private boolean contaAtiva;
    private String aparelho;
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


    public String getAparelho() {
        return aparelho;
    }
    public void setAparelho(String aparelho) {
        this.aparelho = aparelho;
    }
    public void exibeDados () {
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo de aparelho " + getAparelho());
        System.out.println("Nome: " + getEmail());
    }
}
