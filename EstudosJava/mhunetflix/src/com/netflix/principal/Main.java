package com.netflix.principal;

import com.netflix.cliente.Cliente;
import com.netflix.cliente.ErrosCliente;
import com.netflix.operadores.Operadores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ErrosCliente erro = new ErrosCliente();

        Cliente micarla = new Cliente();
        micarla.setNome("Micarla");
        micarla.setEmail("clientemicarla@netflix.com.br");

        Operadores operador = new Operadores();
        System.out.println(operador.getApresentacao());
        System.out.println("Sou sua agente Netflix Fabielly, Boa noite estou verificando sua conta!\n");
        System.out.println("""
                verificando dados da conta...
                localizado...
                """);
        micarla.exibeDados();
        System.out.println("\nFabielly: Pronto estou com sua conta, em que posso ajudar?\n");
        erro.iniciaLigacao();


    }
}