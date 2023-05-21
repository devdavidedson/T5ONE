package com.netflix.cliente;

import java.util.Random;
import java.util.Scanner;

public class ErrosCliente extends Cliente {
    Scanner scanner = new Scanner(System.in);
    private int sorteio = new Random().nextInt(5);
    private int respostaAgente = 0;
    private String menuResposta = "\ndigite 1 ou 2 para selecionar opção:";
    private String erro1 = """
            Cliente: Estou com um erro na minha Netflix, aparece que eu não estou na minha
            localização principal, fala que não é minha Residência. Mas aqui é a
            minha residência! Eu sempre assisti daqui.
            """;
    private String erro2 = """
            Cliente: Eu preciso viajar e recebi um email que vou ter que assinar novamente
            a Netflix pra poder assistir fora da minha casa! Nunca vi me cobrar para
            eu ter que assistir na minha própria Netflix...
            """;
    private String erro3 = """
            Cliente: Minha irmã usa minha Netflix e eu vou ter que fazer um assinante extra?
            Eu não tenho Smart TV e eu só tenho aparelhos móveis.
            """;
    private String erro4 = """
            Cliente: Eu vou viajar e vou demorar para voltar, na minha casa
            só vai ficar meu filho e ele só acessa a Netflix pelo celular! Como faço?
            """;
    private String erro5 = """
            Cliente: Oi, tudo bem? eu queria saber por que na casa da minha prima não está
            mais funcionando a minha Netflix? Ela usa minha conta lá a muito tempo.
            Meu plano é o de R$39,90.
            """;
    private String investigar1 = "Agente: Em que tipo de aparelho que você usa a Netflix?";
    private String investigar2 = "Agente: Mais alguém usa a sua conta Netflix?";
    private String investigar3 = "Agente: Quanto tempo você pretende ficar viajando?";
    private String investigar4 = "Agente: Quais são os aparelhos em que você irá assistir na viajem?";
    private String investigar5 = "Agente: A outra pessoa da sua conta usa Netflix em uma Smart TV?";
    private String investigar6 = "Agente: Vocês moram na mesma residência e usam a mesma rede Wifi?";
    private String investigar7 = "Agente: me fala em quais aparelhos ela(e) assiste.";
    private String investigar8 = "Agente: Ela vai ter que fazer um assinante extra.";

    private String resolucao1 = "Agente: Sua mãe assiste no mesmo endereço usando seu Wifi ou em outro endereço?";
    private String resolucao1de1 = "Sua mãe deve ter definido o endereço dela como sendo o principal da conta.";
    private String resolucao2 = "Agente: O outro endereço foi definido como Residência Netflix por isso que não deu problema.";

    private String residenciaNetflix = "Agente: Foi colocado na  outra Smart TV como sendo a Residencia Netflix, por isso que você não consegue acessar.";
    private String resolucaoResidencia = "Agente: Então vamos colocar sua residência como Localização principal na Residência Netflix (KB 128777).";
    private String assinanteExtra = "Agente: podemos criar um assinante extra. (KB 124633)";
    private String localizacaoPrincipal = "Agente: Posso ajudar você a definir sua localização principal.";
    private String checkIn = "Para fazer o check-in você precisa entrar na Netflix no WiFi onde sua Smart TV definiu Residência Netflix";
    private String assinanteExtraExplicacao = """
            Agente: o assinante extra é uma conta extra dentro da sua conta, onde 
            o "agregado" vai criar a conta dele com email dele e vincular a sua conta.
                        
            Para fazer o assinante extra, o titular precisa ser plano Padrão ou Premium e
            pode ter 1 extra para o Padrão e 2 pro Premium, devo só deixar alinhado que:
            - não pode ser cliente Ativo da Netflix (Que tenha conta Netflix em uso).
            - não pode ter assinante extra com perfil infantil.
            o extra pode tanto escolher criar um perfil novo ou transferir de alguma conta um já existente!
            """;

    private String encerramento = """
            Cliente, volta para tela da nossa chamada se você tiver saído dela...
            Voltou? Ótimo, pode deixar que eu encerro por aqui. Tchau :D
            """;

    public void iniciaLigacao() {
        int sorteio = 2;

        while (getContaAtiva()) {
            if (sorteio == 1) {
                System.out.println(erro1);
                System.out.println("1- " + investigar1);
                System.out.println("2- " + investigar2);
                System.out.println(menuResposta);
                respostaAgente = scanner.nextInt();
                //primeiro laço.
                if (respostaAgente == 1) {
                    System.out.println("\nResposta: Eu uso na TV, minha mãe tem minha Netflix e ta normal lá\n");
                    System.out.println("1- " + resolucao1);
                    System.out.println("2- " + resolucao2);
                    System.out.println(menuResposta);
                    respostaAgente = scanner.nextInt();
                    //primeiro laço interno
                    if (respostaAgente == 1) {
                        System.out.println("\nResposta: É na casa dela, na TV Smart dela...\n");
                        System.out.println(residenciaNetflix);
                        System.out.println(assinanteExtra);
                        System.out.println(localizacaoPrincipal);
                        System.out.println("Cliente: Ai se eu fizer assinante extra vou poder assistir eu e ela?\n");
                        System.out.println(assinanteExtraExplicacao);
                        System.out.println("\nCliente: ficou tudo explicadinho, então vou fazer um assinante extra, mas vai ser no email dela.");
                        System.out.println(resolucaoResidencia);
                        System.out.println("\nPARABÉN, Cliente satisfeiro 0 RCR e 100 de CRES e CSAT!");

                    } else {
                        System.out.println("\nResposta: Eu e minha mãe, mas na casa dela ta NORMAL!\n");
                        System.out.println(residenciaNetflix);
                        System.out.println(assinanteExtra);
                        System.out.println(localizacaoPrincipal);
                        System.out.println("Cliente: Ai se eu fizer assinante extra vou poder assistir eu e ela?\n");
                        System.out.println(assinanteExtraExplicacao);
                        System.out.println("\nCliente: ficou tudo explicadinho, então vou fazer um assinante extra, mas vai ser no email dela.");
                        System.out.println(resolucaoResidencia);
                        System.out.println("\nPARABÉN, Cliente satisfeiro 0 RCR e 100 de CRES e CSAT!");

                    }// Final do primeiro laço internet.
                    //final do primeiro laço
                } else {
                    System.out.println("\nResposta: Eu acabei de falar que minha mãe usa e lá ta normal!\n");
                    System.out.println("1- " + resolucao1de1);
                    System.out.println("2- " + resolucao2);
                    System.out.println(menuResposta);
                    respostaAgente = scanner.nextInt();
                    //primeiro laço
                    if (respostaAgente == 1) {
                        System.out.println("\nResposta: minha mãe não sabe nem usar o controle direito, quem dirá definir alguma coisa...\n");
                        System.out.println("1- Agente: o que posso fazer é te ajudar a definir a Residência Netflix para que você volte a assistir");
                        System.out.println("2- Agente: Como o endereço dela está definido como Residência, posso te ajudar a trocar a localização e criar um assinante extra.");
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        //Segundo laço intero
                        if (respostaAgente == 1) {
                            System.out.println("\nResposta: então avia que eu quero assistir\n");
                            System.out.println(resolucaoResidencia);
                            System.out.println("\nVocê Ajuda o cliente a criar o assinante Extra.");
                            System.out.println("Toma aquele recontato de milhões por não perceber que é no email da mãe dela e a principal ta lá!");

                        } else {
                            System.out.println("Cliente: Ai se eu fizer assinante extra vou poder assistir eu e ela?\n");
                            System.out.println(assinanteExtraExplicacao);
                            System.out.println("\nCliente: ficou tudo explicadinho, então vou fazer um assinante extra, mas vai ser no email dela.");
                            System.out.println(resolucaoResidencia);
                            System.out.println("PARABÉN, Cliente satisfeiro 0 RCR e 100 de CRES e CSAT!");

                        }//final do segundo laço interno.
                        // final do primeiro laço interno.
                    } else {
                        System.out.println("Cliente: E o que eu preciso fazer para voltar a assistir eu e ela?\n");
                        System.out.println("Agente: se for usar a mesma conta posso ajudar a criar um assinante extra.");
                        System.out.println(assinanteExtraExplicacao);
                        System.out.println("\nCliente: ficou tudo explicadinho, então vou fazer um assinante extra, mas vai ser no email dela.");
                        System.out.println("1- " + assinanteExtra);
                        System.out.println("2- Agente: Como o endereço dela está definido como Residência, posso te ajudar a trocar a localização e criar um assinante extra.");
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        if (respostaAgente == 1) {
                            System.out.println("\nVocê Ajuda o cliente a criar o assinante Extra.");
                            System.out.println("Toma aquele recontato de milhões por não perceber que é no email da mãe dela e a principal ta lá!");
                        } else {
                            System.out.println("PARABÉN, Cliente satisfeiro 0 RCR e 100 de CRES e CSAT!");
                        }
                    }
                    //End error1
                }
                setContaAtiva(false);
            } else if (sorteio == 2) {
                System.out.println(erro2);
                System.out.println("1- " + investigar3);
                System.out.println("2- " + investigar4);
                System.out.println(menuResposta);
                respostaAgente = scanner.nextInt();
                if (respostaAgente == 1) {
                    System.out.println("\nCliente: Eu pretendo ficar por volta de 1 mês lá.\n");
                    System.out.println("1- É preciso fazer o check-in antes de sair de casa ta?");
                    System.out.println("2- Em quais aparelhos você pretende assistir na viajem?");
                    System.out.println(menuResposta);
                    respostaAgente = scanner.nextInt();
                    if (respostaAgente == 1) {
                        System.out.println("\nCliente: Eu pretendo ficar por volta de 1 mês lá.\n");
                        System.out.println("1- É preciso fazer o check-in antes de sair de casa ta?");
                        System.out.println("2- Em quais aparelhos você pretende assistir na viajem?");
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        if (respostaAgente == 1) {
                            System.out.println("\nCliente: como eu faço para realizar o procedimento.\n");
                            System.out.println(checkIn);
                            System.out.println("\nCliente: O que é Residência Netflix? Tem que fazer isso tudo pra assistir A MINHA NETFLIX?!");
                            System.out.println("\n1- Agente: O Wifi que sua SmartTV está conectada é definido como sua Residência Netflix");
                            System.out.println("\n2- Agente: Calma senhora, você pode optar por fazer um Assinante Extra.");
                            System.out.println(menuResposta);
                            respostaAgente = scanner.nextInt();
                            if (respostaAgente == 1) {
                                System.out.println("\nCliente: A Netflix caiu muito de qualidade, eu vou entrar judicialmente por que antes não existia isso.\n");
                                System.out.println("1- É preciso fazer o check-in antes de sair de casa ta? É algo do sistema!");
                                System.out.println("Eu já desisti de assiste em viajem. vou cancelar depois.");
                                System.out.println("Te ajudo em algo mais?");
                                System.out.println(encerramento);
                            } else {
                                System.out.println("Cliente: O Que danado é assinante extra? eu vou ter que pagar denovo pra assistir viajando?");
                                System.out.println("");
                            }
                        } else {
                            System.out.println("Só vou assistir no notebook e no tablet.");
                            System.out.println("Pode ir tranquilo e assistir normalmente a sua Netflix!");
                            System.out.println("Cliente: muito obrigado pela informação meu amigo, já estava preocupado com minha serie.\n");
                            System.out.println(encerramento);
                        }
                    }  else {
                        System.out.println("Só vou assistir no notebook e no tablet.");
                        System.out.println("Pode ir tranquilo e assistir normalmente a sua Netflix!");
                        System.out.println("Cliente: muito obrigado pela informação meu amigo, já estava preocupado com minha serie.\n");
                        System.out.println(encerramento);
                    }
                } else {
                    System.out.println("Cliente: Só vou assistir no notebook e no tablet.\n");
                    System.out.println("Agente: Pode ir tranquilo e assistir normalmente a sua Netflix!\n");
                    System.out.println("Cliente: muito obrigado pela informação meu amigo, já estava preocupado com minha serie.\n");
                    System.out.println(encerramento);
                } setContaAtiva(false); // Ou outra condição para encerrar o loop
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
                    setContaAtiva(false); // Ou outra condição para encerrar o loop
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
                    setContaAtiva(false); // Ou outra condição para encerrar o loop
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
                    setContaAtiva(false); // Ou outra condição para encerrar o loop
                }
            }
        }

    }

