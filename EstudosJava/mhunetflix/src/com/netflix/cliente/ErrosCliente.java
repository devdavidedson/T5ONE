package com.netflix.cliente;

import java.util.Random;
import java.util.Scanner;

public class ErrosCliente extends Cliente {
    Scanner scanner = new Scanner(System.in);
    private int sorteio = new Random().nextInt(5);
    private int respostaAgente = 0;
    private String menuResposta = "\ndigite 1 ou 2 para selecionar opção:";
    private String erro1 = """
            Estou com um erro na minha Netflix, aparece que eu não estou na minha
            localização principal, fala que não é minha Residência. Mas aqui é a
            minha residência! Eu sempre assisti daqui.
            """;
    private String erro2 = """
            Eu preciso viajar e recebi um email que vou ter que assinar novamente
            a Netflix pra poder assistir fora da minha casa! Nunca vi me cobrar para
            eu ter que assistir na minha própria Netflix...
            """;
    private String erro3 = """
            Minha irmã usa minha Netflix e eu vou ter que fazer um assinante extra?
            Eu não tenho Smart TV e eu só tenho aparelhos móveis.
            """;
    private String erro4 = """
            Eu vou viajar e vou demorar para voltar, na minha casa
            só vai ficar meu filho e ele só acessa a Netflix pelo celular! Como faço?
            """;
    private String erro5 = """
            Oi, tudo bem? eu queria saber por que na casa da minha prima não está
            mais funcionando a minha Netflix? Ela usa minha conta lá a muito tempo.
            Meu plano é o de R$39,90.
            """;
    private String investigar1 = "Em que tipo de aparelho que você usa a Netflix?";
    private String investigar2 = "Mais alguém usa a sua conta Netflix?";
    private String investigar3 = "Quanto tempo você pretende ficar viajando?";
    private String investigar4 = "Quais são os aparelhos em que você irá assistir na viajem?";
    private String investigar5 = "A outra pessoa da sua conta usa Netflix em uma Smart TV?";
    private String investigar6 = "Vocês moram na mesma residência e usam a mesma rede Wifi?";
    private String investigar7 = "me fala em quais aparelhos ela(e) assiste.";
    private String investigar8 = "Ela vai ter que fazer um assinante extra.";

    public void iniciaLigacao() {
        int sorteio = 1;

        while (!getContaAtiva()) {
            if (sorteio == 1) {
                System.out.println(erro1);
                System.out.println("1- " + investigar1);
                System.out.println("2- " + investigar2);
                System.out.println(menuResposta);
                respostaAgente = scanner.nextInt();
                    if (respostaAgente == 1) {
                        System.out.println("Eu uso na TV, minha mãe tem minha Netflix e ta normal lá");
                        
                    } else {
                        System.out.println("Eu e minha mãe, mas na casa dela ta NORMAL!");
                    }
                setContaAtiva(true); // Ou outra condição para encerrar o loop
            } else if (sorteio == 2) {
                System.out.println(erro2);
                System.out.println("1- " + investigar3);
                System.out.println("2- " + investigar4);
                System.out.println(menuResposta);
                respostaAgente = scanner.nextInt();
                    if (respostaAgente == 1) {
                        System.out.println("resposta de continuação vindo....");
                    } else {
                        System.out.println("resposta de continuação vindo....");
                    }
                setContaAtiva(true); // Ou outra condição para encerrar o loop
            } else if (sorteio == 3) {
                System.out.println(erro3);
                System.out.println("1- " + investigar5);
                System.out.println("2- " + investigar6);
                System.out.println(menuResposta);
                respostaAgente = scanner.nextInt();
                    if (respostaAgente == 1) {
                        System.out.println("resposta de continuação vindo....");
                    } else {
                        System.out.println("resposta de continuação vindo....");
                    }
                setContaAtiva(true); // Ou outra condição para encerrar o loop
            } else if (sorteio == 4) {
                System.out.println(erro4);
                System.out.println("1- " + investigar3);
                System.out.println("2- " + investigar4);
                System.out.println(menuResposta);
                respostaAgente = scanner.nextInt();
                    if (respostaAgente == 1) {
                        System.out.println("resposta de continuação vindo....");
                    } else {
                        System.out.println("resposta de continuação vindo....");
                    }
                setContaAtiva(true); // Ou outra condição para encerrar o loop
            } else {
                System.out.println(erro5);
                System.out.println("1- " + investigar7);
                System.out.println("2- " + investigar8);
                System.out.println(menuResposta);
                respostaAgente = scanner.nextInt();
                    if (respostaAgente == 1) {
                        System.out.println("resposta de continuação vindo....");
                    } else {
                        System.out.println("resposta de continuação vindo....");
                    }
                setContaAtiva(true); // Ou outra condição para encerrar o loop
            }
        }
    }

}

