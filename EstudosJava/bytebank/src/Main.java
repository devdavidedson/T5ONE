import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DadosPessoais primeiroCliente = new DadosPessoais();

        System.out.println("Qual nome do Titular da conta? ");
        String nome = scanner.nextLine();
        primeiroCliente.setNome(nome);
        System.out.println("Qual saldo você possui? ");
        double saldoInicial = scanner.nextDouble();
        primeiroCliente.setSaldo(saldoInicial);
        primeiroCliente.setCpf();

        System.out.println("Titular da conta: " + primeiroCliente.getNome());
        System.out.println("Saldo inicial: " + primeiroCliente.getSaldo());
        System.out.println("CPF: " + primeiroCliente.getCpf());
        primeiroCliente.menuInicial();

    }
}