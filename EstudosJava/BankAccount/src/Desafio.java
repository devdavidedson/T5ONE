import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldo;
        String nome;
        int acessoMenu = 0;
        System.out.println("Qual o seu Nome?");
        nome = scanner.nextLine();
        System.out.println("Qual o seu saldo inicial?");
        saldo = scanner.nextInt();

        String menu = """
                *********************************************
                
                Dados iniciais do cliente
                Nome:                    %s
                tipo:                    Conta corrente
                Saldo inicial:           R$: %d
                
                *********************************************
                """.formatted(nome, saldo);
        String subMenu = """
                1- Consultar Saldo.
                2- Receber Depósito.
                3- transferir.
                4- para sair.
                
                """;

        System.out.println(menu);

        while (acessoMenu != 4) {

            System.out.println(subMenu);
            System.out.println("Digite uma opção do Menu");
            acessoMenu = scanner.nextInt();

            if (acessoMenu == 1) {
                System.out.println("Seu saldo é: " + saldo);
            } else if (acessoMenu == 2) {
                System.out.println("Qual valor do depósito?");
                double recebePix = scanner.nextInt();
                saldo += recebePix;
                System.out.println("Você recebeu um depósito, seu novo saldo é: " + saldo);
            } else if (acessoMenu == 3) {
                System.out.println("Quanto você deseja retirar:");
                double transferencia = scanner.nextInt();
                if (transferencia > saldo) {
                    System.out.println("Valor de retirada maior que o Saldo em conta");
                } else {
                    saldo -= transferencia;
                    System.out.println("Você fez uma transferência, seu novo saldo é: " + saldo);
                }
            } else if (acessoMenu != 4) {
                System.out.println("Operação inválida, tente novamente");
            } else {
                System.out.println("Sessão encerada.");
                break;
            }
        }

    }
}
