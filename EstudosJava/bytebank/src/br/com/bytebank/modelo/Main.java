package br.com.bytebank.modelo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente primeiroCliente = new ContaCorrente(1921, 23450008);
        Cliente cliente = new Cliente();

        System.out.println("Qual nome do Titular da conta? ");
        String nome = scanner.nextLine();
        cliente.setNome(nome);//está dando erro no setNome
        System.out.println("Qual saldo você possui? ");
        double saldoInicial = scanner.nextDouble();
        primeiroCliente.setSaldo(saldoInicial);
        cliente.setCpf();

        System.out.println("Titular da conta: " + cliente.getNome());
        System.out.println("Saldo inicial: " + primeiroCliente.getSaldo());
        System.out.println("CPF: " + cliente.getCpf());
        primeiroCliente.menuInicial();

    }
}