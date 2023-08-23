package br.com.bytebank.modelo;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    private boolean isValidInput(String input) {
        return input.matches("\\d+");
    }
    //Verificando se a entrada tem apenas caracteres númericos.
    public void setCpf() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Confirme seu CPF: ");

        String input = scanner.next();

        if (isValidInput(input) && input.length() == 11) {
            this.cpf = formatCpf(input);
        } else {
            System.out.println("Entrada inválida! Digite um CPF válido contendo 11 dígitos numéricos.");
            setCpf();
        }
    }
    //adiciona os pontos e o hiffen formatando a String de retorno do usuário.
    private String formatCpf(String input) {
        StringBuilder formattedCpf = new StringBuilder(input);
        formattedCpf.insert(9, "-").insert(6, ".").insert(3, ".");
        return formattedCpf.toString();
    }

}
