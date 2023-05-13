import java.util.Scanner;

public class DesafioContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldo = 2500;
        int acessoMenu = 0;
        String menu = """
                *********************************************
                
                Dados iniciais do cliente
                Nome:                    David Edson
                tipo:                    Conta corrente
                Saldo inicial:           R$: 2500
                
                *********************************************
                """;
        String subMenu = """
                1- Consultar Saldo.
                2- Receber Depósito.
                3- transferir.
                4- para sair.
                """;

        System.out.println(menu);

        while (acessoMenu != 4) {

            int recebePix = 0;
            int transferencia =0;

            System.out.println(subMenu);
            System.out.println("Digite uma opção do Menu");
            acessoMenu = scanner.nextInt();

            if (acessoMenu == 1) {
                System.out.println("Seu saldo é: " + saldo);
            } else if (acessoMenu == 2) {
                System.out.println("Qual valor do depósito?");
                recebePix = scanner.nextInt();
                saldo = saldo + recebePix;
                System.out.println("Você recebeu um depósito, seu novo saldo é: " + saldo);
            } else if (acessoMenu == 3) {
                System.out.println("Quanto você deseja retirar:");
                transferencia = scanner.nextInt();
                if (transferencia > saldo) {
                    System.out.println("Valor de retirada maior que o Saldo em conta");
                } else {
                    saldo = saldo - transferencia;
                    System.out.println("Você fez uma transferência, seu novo saldo é: " + saldo);
                }
            } else if (acessoMenu > 4) {
                System.out.println("Operação inválida, tente novamente");
            } else {
                System.out.println("Encerrada a sessão.");
                break;
            }
        }


    }
}
