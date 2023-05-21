package com.netflix;

import com.netflix.cliente.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente micarla = new Cliente();
        micarla.setNome("Micarla");
        micarla.setContaAtiva(true);
        micarla.setAparelho("TV Smart");
        micarla.setEmail("clientemicarla@netflix.com.br");

        Operadores operador = new Operadores();
        System.out.println(operador.getApresentacao());
        micarla.exibeDados();
        System.out.println("Sou sua agente Netflix Fabielly, Boa noite, como posso ajudar?!");

    }
}