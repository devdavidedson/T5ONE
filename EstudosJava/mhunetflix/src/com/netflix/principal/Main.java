package com.netflix.principal;

import com.netflix.cliente.Cliente;
import com.netflix.cliente.FluxoDeErros;
import com.netflix.operadores.Operadores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.print("Qual seu nome de agente: \n");
        String agente = scanner.nextLine();
        System.out.print("Quem está ligando: \n");
        String nome = scanner.nextLine();
        cliente.setAgente(agente);
        cliente.setNome(nome);
        cliente.setEmail(cliente.getNome() + "cliente@netflix.com.br");



        Operadores operador = new Operadores();
        System.out.println(operador.getApresentacao());
        System.out.println("Sou seu agente Netflix " + agente + ", Boa noite estou verificando sua conta!\n");
        System.out.println("""
                verificando dados da conta...
                localizado...
                """);
        cliente.exibeDados();
        cliente.exibeDadosAgente();

        FluxoDeErros erro = new FluxoDeErros();
        erro.iniciaLigacao(cliente);

    }
}