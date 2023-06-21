import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaDoBanco primeiroCliente = new DadosPessoais();

        System.out.println("Qual nome do Titular da conta? ");
        String nome = scanner.nextLine();
        primeiroCliente.titular.setNome(nome);
        System.out.println("Qual saldo você possui? ");
        double saldoInicial = scanner.nextDouble();
        primeiroCliente.setSaldo(saldoInicial);
        primeiroCliente.titular.setCpf();

        System.out.println("Titular da conta: " + primeiroCliente.titular.getNome());
        System.out.println("Saldo inicial: " + primeiroCliente.getSaldo());
        System.out.println("CPF: " + primeiroCliente.titular.getCpf());
        primeiroCliente.menuInicial();

    }
}