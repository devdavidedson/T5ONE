package com.netflix.cliente;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ErrosCliente extends Cliente {
    Scanner scanner = new Scanner(System.in);
    private int sorteio = new Random().nextInt(4);
    private int respostaAgente = 0;
    private String menuResposta = "\ndigite 1 ou 2 para selecionar opção:";
    private String erro1 = """
            Cliente: Estou com um erro na minha Netflix, aparece que eu não estou na
            localização principal, fala que não é minha Residência. Mas aqui é a
            minha residência! Eu sempre assisti daqui.
            """;
    private String erro2 = """
            Cliente: Eu preciso viajar e recebi um email que vou ter que assinar novamente
            a Netflix pra poder assistir fora da minha casa! Nunca vi me cobrar para
            eu ter que assistir na minha própria Netflix...
            """;
    private String erro3 = "Cliente: Minha irmã usa minha Netflix, eu vou ter que fazer um assinante extra?";
    private String erro4 = """
            Eu uso a Netflix que assinei aqui pra casa, na minha Loja,
            agora não vou poder mais usar?!
            """;
    private String erro5 = """
            Cliente: Oi, tudo bem? eu queria saber por que na casa da minha prima não está
            mais funcionando a minha Netflix? Ela usa minha conta lá a muito tempo.
            Meu plano é o de R$39,90.
            """;
    private String investigar1 = "Agente: Quem é o titular da conta Netflix?";
    private String investigar2 = "Agente: Mais alguém usa a sua conta Netflix?";
    private String investigar3 = "Agente: Quanto tempo você pretende ficar viajando?";
    private String investigar4 = "Agente: Quais são os aparelhos em que você irá assistir?";
    private String investigar5 = "Agente: Basta fazer um check-in?";
    private String investigar6 = "Agente: Em que aparelhos você e sua irmã usam a Netflix?";
    private String investigar7 = "Agente: me fala em quais aparelhos ela(e) assiste.";
    private String investigar8 = "Agente: Ela vai ter que fazer um assinante extra.";

    private String resolucao1de1 = "Sua mãe deve ter definido o endereço dela como sendo o principal da conta.";

    private String residenciaNetflix = "Agente: Foi colocado em outra Smart TV como sendo a Residencia Netflix, por isso que você não consegue acessar.";
    private String resolucaoResidencia = "Agente: Só precisamos colocar sua SMART-TV como Localização principal na Residência Netflix (KB 128777).";
    private String assinanteExtra = "Agente: podemos criar um assinante extra. (KB 124633)";
    private String localizacaoPrincipal = "Agente: Posso ajudar você a definir sua localização principal.";
    private String checkIn = """
            Agente: Para fazer o check-in você precisa entrar na Netflix no WiFi onde sua Smart TV definiu Residência Netflix
            depois é só ir na local onde precisa liberar, conectar seu Celular o Wifi de lá e entrar na Netflix no celular.
            Pronto, depois desse processo você pode usar normalmente. Lembrando que tem que ser algo periódico.         
            """;
    private String assinanteExtraExplicacao = """
            Agente: o assinante extra é uma conta extra dentro da sua conta, onde 
            o "agregado" vai criar a conta dele com email dele e vincular a sua conta.
                        
            Para fazer o assinante extra, o titular precisa ser plano Padrão ou Premium e
            pode ter 1 extra para o Padrão e 2 pro Premium, devo só deixar alinhado que:
            - não pode ser cliente Ativo da Netflix (Que tenha conta Netflix em uso).
            - não pode ter assinante extra com perfil infantil.
            o extra pode tanto escolher criar um perfil novo ou transferir de alguma conta um já existente!
            """;
    private String elogio = "ESSE ATENDIMENTO NÃO TEVE RCR E ESTÁ COM 100% DE CRES E CSAT.";
    private String detalheInvestigacao = "\n***MUITA ATENÇÃO aos detalhes e perguntas investigativas para o Cliente!***";
    private String encerramento = """
            Agente: Cliente, volta para tela da nossa chamada aí!...
            Voltou? Ótimo, pode deixar que eu encerro por aqui. Tchau.
            """;

    public void iniciaLigacao() {

        while (getContaAtiva()) {
            if (sorteio == 1) {
                System.out.println(erro1);
                System.out.println("1- " + investigar1);
                System.out.println("2- " + investigar2);
                System.out.println(menuResposta);
                respostaAgente = scanner.nextInt();
                //primeiro laço.
                if (respostaAgente == 1) { //primeiro IF do 1
                    System.out.println("\nCliente: Sou eu a dona da conta.\n");
                    System.out.println("1- " + investigar2);
                    System.out.println("2- " + residenciaNetflix);
                    System.out.println(menuResposta);
                    respostaAgente = scanner.nextInt();
                    //primeiro laço interno
                    if (respostaAgente == 1) { // segundo IF do 1
                        System.out.println("\nResposta: Eu e minha mãe usamos, ela tem um ponto na casa dela.\n");
                        System.out.println(residenciaNetflix);
                        System.out.println(assinanteExtra);
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        if (respostaAgente == 1) { //terceiro IF do 1
                            System.out.println("\nCliente: Como eu faço pra voltar a assistir?");
                            System.out.println("\n1- " + resolucaoResidencia);
                            System.out.println("2- Agente: Vamos lá vou te ajudar a criar o assinante extra.");
                            System.out.println(menuResposta);
                            respostaAgente = scanner.nextInt();
                            if (respostaAgente == 1) { // QUARTO IF do 1
                                System.out.println("Cliente: OK! vamos fazer isso então...");
                                System.out.println(encerramento);
                                System.out.println("\nRafael Arduini: Você como agente tem que deixar claro para o cliente");
                                System.out.println("as Opções e as consequencias de tudo. Ela vai mudar a Residência Netflix e");
                                System.out.println("a mãe dela vai perder o acesso!\n");
                                System.out.println(detalheInvestigacao);
                                System.out.println("Tomou aquele RCR de milhões.");
                            } else { // QUARTO ELSE do 1
                                System.out.println("Cliente: Sim vamos criar um por favor!");
                                System.out.println("\nRafael Arduini: Aqui você cria o assinante extra de forma majestosa.");
                                System.out.println("Porém toma um RCR de MILHÕES por que não ajustou a Residência Netflix.");
                                System.out.println("Ela era a Titular da conta e criou no email da mãe dela e mesmo assim não conseguiu acesso");
                                System.out.println("***MUITA atenção as perguntas de investigação***");
                            }
                        } else { //TERCEIRO ELSE DO 1
                            System.out.println(assinanteExtraExplicacao);
                            System.out.println("1- Agente: Você quer criar o Assinante extra?");
                            System.out.println("2- Agente: Ou você pode ficar assistindo de aparelhos móveis que é liberado.");
                            System.out.println(menuResposta);
                            respostaAgente = scanner.nextInt();
                            if (respostaAgente == 1) { // TERCEIRO ELSE DO 1 primeiro IF
                                System.out.println("Cliente: Sim vamos criar um por favor!");
                                System.out.println("\nRafael Arduini: Aqui você cria o assinante extra de forma majestosa.");
                                System.out.println("Porém toma um RCR de MILHÕES por que não ajustou a Residência Netflix.");
                                System.out.println("Ela era a Titular da conta e criou no email da mãe e mesmo assim não conseguiu acesso");
                                System.out.println("por que a mãe dela que deveria ser a Assinante Extra.");
                                System.out.println(detalheInvestigacao);
                            } else { // TERCEIRO ELSE DO 1 PRIMEIRO ELSE
                                System.out.println("Rafael Arduini: Você deve se atentar que a cliente ligou com erro");
                                System.out.println("de Residência Netflix > Localização principal, então ela quer");
                                System.out.println("Assistir na TV. (APARELHO MÓVEL NÃO PRECISA DE LOCALIZAÇÃO!");
                                System.out.println(detalheInvestigacao);
                            }
                        }

                    } else { // SEGUNDO ELSE DO 1
                        System.out.println("\nResposta: Eu e minha mãe usamos, mas na casa dela ta NORMAL!\n");
                        System.out.println("1- Agente: Então podemos criar um Assinante extra para ela e definir você como localização principal.");
                        System.out.println("2- " + assinanteExtra);
                        System.out.println("3- " + localizacaoPrincipal);
                        if (respostaAgente == 1) {
                            System.out.println("Rafael Arduini: Parabéns, conseguiu ajudar o cliente da melhor forma!");
                            System.out.println("Colocou a Titular como Residência Netflix e os demais como Assinante Extra.");
                            System.out.println(elogio);
                        } else if (respostaAgente == 2) {
                            System.out.println("Cliente: Sim vamos criar um por favor!");
                            System.out.println("\nRafael Arduini: Aqui você cria o assinante extra de forma majestosa.");
                            System.out.println("Porém toma um RCR de MILHÕES por que não ajustou a Residência Netflix.");
                            System.out.println("Ela era a Titular da conta e criou no email da mãe e mesmo assim não conseguiu acesso");
                            System.out.println("por que a mãe dela que deveria ser a Assinante Extra.");
                            System.out.println(detalheInvestigacao);
                        } else {
                            System.out.println("Cliente: Sim vamos definir por favor!");
                            System.out.println("\nRafael Arduini: Aqui você defini a localização de forma majestosa.");
                            System.out.println("Porém toma um RCR de MILHÕES por que não ajustou a casa da mãe dela, nem ofereceu Assinante Extra na mãe.");
                            System.out.println(detalheInvestigacao);
                        }
                    }// Final do primeiro laço internet.
                    //final do primeiro laço
                } else { // PRIMEIRO ELSE DO LAÇO 2
                    System.out.println("Cliente: Assiste eu na minha casa e minha mãe na casa dela, mas moça na minha mãe ta NORMAL!");
                    System.out.println("1- " + resolucao1de1);
                    System.out.println("2- " + investigar1);
                    System.out.println(menuResposta);
                    respostaAgente = scanner.nextInt();
                    if (respostaAgente == 1) { //PRIMEIRO IF DO 2
                        System.out.println("\nResposta: minha mãe não sabe nem usar o controle direito, quem dirá definir alguma coisa...\n");
                        System.out.println("1- Agente: o que posso fazer é te ajudar a definir a Residência Netflix para que você volte a assistir");
                        System.out.println("2- Agente: Como o endereço dela está definido como Residência, posso te ajudar a trocar a localização e criar um assinante extra.");
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        if (respostaAgente == 1) { // SEGUNDO IF DO 2
                            System.out.println("\nResposta: então avia que eu quero assistir\n");
                            System.out.println(resolucaoResidencia);
                            System.out.println("\nRafael Arduini: Você Ajuda o cliente a criar o assinante Extra.");
                            System.out.println("Toma aquele recontato de milhões por não perceber que é no email da mãe dela e a principal ta lá!");
                            System.out.println(detalheInvestigacao);
                        } else {
                            System.out.println("Cliente: Ai se eu fizer assinante extra vou poder assistir eu e ela?\n");
                            System.out.println(assinanteExtraExplicacao);
                            System.out.println("\nCliente: ficou tudo explicadinho, então vou fazer um assinante extra, mas vai ser no email dela.");
                            System.out.println(resolucaoResidencia);
                            System.out.println(elogio);
                        }//final do segundo laço interno.
                    } else { // PRIMEIRO ELSE DO 2
                        System.out.println("Cliente: Eu sou titular, minha mãe usa minha Netflix na casa dela.\n");
                        System.out.println("1- " + assinanteExtra);
                        System.out.println("2- Agente: Como o endereço dela está definido como Residência, posso te ajudar a trocar a localização e criar um assinante extra.");
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        if (respostaAgente == 1) {
                            System.out.println("Cliente: tá bom, vamos criar o assinante extra então.");
                            System.out.println("\nRafael Arduini: Você Ajuda o cliente a criar o assinante Extra.");
                            System.out.println("Toma aquele recontato de milhões por não perceber que é no email da mãe dela e a principal ta lá!");
                            System.out.println(detalheInvestigacao);
                        } else {
                            System.out.println("Rafael Arduini: Arrumou Localização e criou assinante Extra, contato certinho, perfeito!");
                            System.out.println("Deixou a titular como Residência Netflix e os demais com Assinante extra!");
                            System.out.println(elogio);
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
                        System.out.println("\nCliente: Como eu faço para realizar o procedimento.\n");
                        System.out.println(checkIn);
                        System.out.println("\nCliente: O que é Residência Netflix? Tem que fazer isso tudo pra assistir A MINHA NETFLIX?!");
                        System.out.println("\n1- Agente: O Wifi que sua SmartTV está conectada é definido como sua Residência Netflix");
                        System.out.println("2- Agente: Calma senhora, você pode optar por fazer um Assinante Extra.");
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        if (respostaAgente == 1) {
                            System.out.println("Cliente: mas eu só assisto por aparelhos móveis, meu filho usa o Tablet e eu vou viajar com o Note");
                            System.out.println("Cliente: Olha o aborrecimento já está grande demais, cancele minha Netflix por favor...");
                            System.out.println("Cliente: Nem se vocês me derem de graça eu quero mais.");

                            if (respostaAgente == 1) {
                                System.out.println("\nCliente: A Netflix caiu muito de qualidade, eu vou entrar judicialmente por que antes não existia isso.\n");
                                System.out.println("Agente: É necessário fazer o check-in antes de sair de casa ta? É algo do sistema!");
                                System.out.println("\nCliente:Eu já desisti de assiste em viajem. vou cancelar depois.");
                                System.out.println("Agente: Te ajudo em algo mais?");
                                System.out.println("\nRafael Arduini: Lembrem-se de fazer sempre as perguntas corretas de investigação");
                                System.out.println("Perguntar em que aparelhos assistir, deve ser a maior prioridade em todas as situações");
                            } else {
                                System.out.println("Cliente: O Que danado é assinante extra? eu vou ter que pagar denovo pra assistir viajando?");
                                System.out.println("Cliente: mas eu só assisto por aparelhos móveis, meu filho usa o Tablet e eu vou viajar com o Note");
                                System.out.println("Cliente: Olha o aborrecimento já está grande demais, cancele minha Netflix por favor...");
                                System.out.println("Cliente: Nem se vocês me derem de graça eu quero mais.");
                                System.out.println("\nRafael Arduini: Lembrem-se de fazer sempre as perguntas corretas de investigação");
                                System.out.println("Perguntar em que aparelhos assistir, deve ser a maior prioridade em todas as situações");
                            }
                        } else {
                            System.out.println("Cliente: Ja veio novamente com a história de pagar pra assistir a minha Netflix?");
                            System.out.println("Cliente: O que danado é esse Assinante extra?");
                            System.out.println(assinanteExtraExplicacao);
                            System.out.println("\nCliente: Você disse 1 kilo eu num entendi 1 grama. Cancele logo a Netflix!");
                            System.out.println("\nRafael Arduini: Lembrem-se de fazer sempre as perguntas corretas de investigação");
                            System.out.println("Perguntar em que aparelhos assistir, deve ser a maior prioridade em todas as situações");
                        }
                    }  else {
                        System.out.println("Cliente: Só vou assistir no notebook e no tablet.\n");
                        System.out.println("Agente: Pode ir tranquilo e assistir normalmente a sua Netflix!\n");
                        System.out.println("Cliente: muito obrigado pela informação meu amigo, já estava preocupado com minha serie.\n");
                        System.out.println(encerramento);
                    }
                } else {
                    System.out.println("Cliente: Só vou assistir no notebook e no tablet.\n");
                    System.out.println("Agente: Pode ir tranquilo e assistir normalmente a sua Netflix!\n");
                    System.out.println("Cliente: muito obrigado pela informação meu amigo, já estava preocupado com minha serie.\n");
                    System.out.println(encerramento);
                } setContaAtiva(false);
                // END ERRO 2
            } else if (sorteio == 3) {
                    System.out.println(erro3);
                    System.out.println("1- " + investigar1);
                    System.out.println("2- " + investigar6);
                    System.out.println(menuResposta);
                    respostaAgente = scanner.nextInt();
                    if (respostaAgente == 1) {//PRIMEIRO IF
                        System.out.println("Cliente: Eu sou o titular da conta e minha irmã e minha mãe usam uma tela cada.");
                        System.out.println("2- Agente: Vocês usam no mesmo Wifi?");
                        System.out.println("2- Agente: Se a Netflix definir a SmartTV da sua irmã como principal, você perderá acesso na sua TV.");
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        if (respostaAgente == 1) {
                            System.out.println("Cliente: Sim! moramos juntas na mesma casa.");
                            System.out.println("1- Agente: então não existe problema nenhum, podem assistir a vontade!");
                            System.out.println("2- " + assinanteExtra);
                            System.out.println(menuResposta);
                            respostaAgente = scanner.nextInt();
                            if (respostaAgente == 1) {
                                System.out.println("Rafael Arduini: Parabéns, é muito importante Observar que elas moram juntas e no mesmo WIFI");
                                System.out.println("Quando tem relação entre Wifi + smartTV + aparelho, é definido uma Residência Netflix.");
                                System.out.println("logo todos os aparelhos que ali se conectam, tem acesso a conta do Titular!");
                                System.out.println(elogio);
                            } else {
                                System.out.println("Cliente: me explica direitinho o que é assinante Extra!");
                                System.out.println("1- " + assinanteExtraExplicacao);
                                System.out.println("2- Agente: Podemos também resolver com a localização principal na Residência Netflix.");
                                System.out.println(menuResposta);
                                respostaAgente = scanner.nextInt();
                                if (respostaAgente == 1) {
                                    System.out.println("Devemos sempre nos atentar as perguntas investigativas, porém");
                                    System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                                    System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                                    System.out.println("logo nada deve ser feito!");
                                    System.out.println(detalheInvestigacao);
                                } else {
                                    System.out.println("Devemos sempre nos atentar as perguntas investigativas, porém");
                                    System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                                    System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                                    System.out.println("logo nada deve ser feito!");
                                    System.out.println(detalheInvestigacao);
                                }
                            }
                        } else {
                            System.out.println("Cliente: me explica direitinho o que é assinante Extra!");
                            System.out.println("1- " + assinanteExtraExplicacao);
                            System.out.println("2- Agente: Podemos também resolver com a localização principal na Residência Netflix.");
                            System.out.println(menuResposta);
                            respostaAgente = scanner.nextInt();
                            if (respostaAgente == 1) {
                                System.out.println("Devemos sempre nos atentar as perguntas investigativas, porém");
                                System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                                System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                                System.out.println("logo nada deve ser feito!");
                                System.out.println(detalheInvestigacao);
                            } else {
                                System.out.println("Devemos sempre nos atentar as perguntas investigativas, porém");
                                System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                                System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                                System.out.println("logo nada deve ser feito!");
                                System.out.println(detalheInvestigacao);
                            }
                        }
                    } else { //primeiro ELSE
                        System.out.println("Cliente: Ela e eu usamos na SmartTV e minha mãe no celular.");
                        System.out.println("1- " + investigar1);
                        System.out.println("2- Agente: Vocês usam no mesmo Wifi?");
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        if (respostaAgente == 1) {
                            System.out.println("Cliente: Eu sou o titular da conta e minha irmã e minha mãe usam uma tela cada.");
                            System.out.println("2- Agente: Vocês usam no mesmo Wifi?");
                            System.out.println("2- Agente: Se a Netflix definir a SmartTV da sua irmã como principal, você perderá acesso na sua TV.");
                            System.out.println(menuResposta);
                            respostaAgente = scanner.nextInt();
                            if (respostaAgente == 1) {
                                System.out.println("Cliente: Sim! moramos juntas na mesma casa.");
                                System.out.println("1- Agente: então não existe problema nenhum, podem assistir a vontade!");
                                System.out.println("2- " + assinanteExtra);
                                System.out.println(menuResposta);
                                respostaAgente = scanner.nextInt();
                                if (respostaAgente == 1) {
                                    System.out.println("Rafael Arduini: Parabéns, é muito importante Observar que elas moram juntas e no mesmo WIFI");
                                    System.out.println("Quando tem relação entre Wifi + smartTV + aparelho, é definido uma Residência Netflix.");
                                    System.out.println("logo todos os aparelhos que ali se conectam, tem acesso a conta do Titular!");
                                    System.out.println(elogio);
                                } else {
                                    System.out.println("Rafael Arduini: Gente, a resolução já foi dada!");
                                    System.out.println("Devemos sempre nos atentar as perguntas investigativas, porém");
                                    System.out.println("temos que ver as respostas, cliente disse que todos os aparelhos estão");
                                    System.out.println("conectados a mesma rede Wifi, então ele compoe uma Residência Netflix...");
                                    System.out.println("logo nada deve ser feito!");
                                    System.out.println(detalheInvestigacao);
                                }
                            } else {
                                System.out.println("Cliente: E o que eu posso fazer pra evitar esse cenário?");
                                System.out.println("1- " + assinanteExtra);
                                System.out.println("2- Agente: Podemos também, definir a sua TV como principal para Residência Netflix!");
                                System.out.println(menuResposta);
                                respostaAgente = scanner.nextInt();
                                if (respostaAgente == 1) {
                                    System.out.println("Devemos sempre nos atentar as perguntas investigativas, porém");
                                    System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                                    System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                                    System.out.println("logo nada deve ser feito!");
                                    System.out.println(detalheInvestigacao);
                                } else {
                                    System.out.println("Devemos sempre nos atentar as perguntas investigativas, porém");
                                    System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                                    System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                                    System.out.println("logo nada deve ser feito!");
                                    System.out.println(detalheInvestigacao);
                                }
                            }
                        } else {
                            System.out.println("Cliente: Sim! moramos juntas na mesma casa.");
                            System.out.println("1- Agente: então não existe problema nenhum, podem assistir a vontade!");
                            System.out.println("2- " + assinanteExtra);
                            System.out.println(menuResposta);
                            respostaAgente = scanner.nextInt();
                            if (respostaAgente == 1) {
                                System.out.println("Rafael Arduini: Parabéns, é muito importante Observar que elas moram juntas e no mesmo WIFI");
                                System.out.println("Quando tem relação entre Wifi + smartTV + aparelho, é definido uma Residência Netflix.");
                                System.out.println("logo todos os aparelhos que ali se conectam, tem acesso a conta do Titular!");
                                System.out.println(elogio);
                            } else {
                                System.out.println("Rafael Arduini: Gente, a resolução já foi dada!");
                                System.out.println("Devemos sempre nos atentar as perguntas investigativas, porém");
                                System.out.println("temos que ver as respostas, cliente disse que todos os aparelhos estão");
                                System.out.println("conectados a mesma rede Wifi, então ele compoe uma Residência Netflix...");
                                System.out.println("logo nada deve ser feito!");
                                System.out.println(detalheInvestigacao);
                            }
                        }
                    }//FIM do FLUXO
                    setContaAtiva(false); // Ou outra condição para encerrar o loop
                } else if (sorteio == 4) {
                    System.out.println(erro4);
                    System.out.println("1- " + investigar5);
                    System.out.println("2- " + investigar4);
                    System.out.println(menuResposta);
                    respostaAgente = scanner.nextInt();
                    if (respostaAgente == 1) { //PRIMEIRO IF DO 1
                        System.out.println("Cliente: o que é check-in?");
                        System.out.println("1- Agente: explicar em detalhes o check-in.");
                        System.out.println("2- Agente: é só entrar na Netflix pelo celular na sua casa e depois entrar na loja");
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        if (respostaAgente == 1) { // SEGUNDO IF DO 1
                            System.out.println(checkIn);
                            System.out.println("Rafael Arduini: parabéns, alinhou com cliente direitinho.");
                            System.out.println("Contato rápido, com contexto e Objetivo, TMA baixo do jeito que tem que ser");
                            System.out.println(elogio);
                        } else { // SEGUNDO ELSE DO 1
                            System.out.println("Rafael Arduini: a resolução do problema foi correta, mas o principal");
                            System.out.println("detalhe não foi passado, que o celular que vai fazer o check-in");
                            System.out.println("tem que estar conectado a mesma Wifi da SmartTV que está como Residência Netflix");
                            System.out.println("Levou aquele RCR de milhões pq a cliente entrou pelos dados móveis.");
                        } // FIM DO FLUXO 1
                    } else { // INICIO ELSE DO 2
                        System.out.println("Cliente: tenho duas TVs Smart.");
                        System.out.println("1- Agente: na sua casa você usa em quais aparelhos?");
                        System.out.println("2 - Agente: de quanto em quanto tempo você vai na sua loja?");
                        System.out.println(menuResposta);
                        respostaAgente = scanner.nextInt();
                        if (respostaAgente == 1) { // PRIMEIRO IF DO 2
                            System.out.println("Na minha casa eu uso na TV e no tablet, quem assiste é meu filho.");
                            System.out.println("1- Agente: podemos mudar a localização principal da Residência Netflix para o trabalho.");
                            System.out.println("2- Agente: podemos fazer um check-in.");
                            if (respostaAgente == 1) { //SEGUNDO IF INTERNO DO 2
                                System.out.println("Rafael Arduini: Nesse caso a mudança de localização não se aplica.");
                                System.out.println("Se ele mudar a localização da Residência Netflix, ele perderá o acesso em casa");
                                System.out.println(detalheInvestigacao);
                            } else { // SEGUNDO ELSE INTERNO DO 2
                                System.out.println("Cliente: o que é check-in?");
                                System.out.println("1- Agente: explicar em detalhes o check-in.");
                                System.out.println("2- Agente: é só entrar na Netflix pelo celular na sua casa e depois entrar na loja");
                                System.out.println(menuResposta);
                                respostaAgente = scanner.nextInt();
                                if (respostaAgente == 1) {
                                    System.out.println(checkIn);
                                    System.out.println("Rafael Arduini: parabéns, alinhou com cliente direitinho.");
                                    System.out.println("Contato rápido, com contexto e Objetivo, TMA baixo do jeito que tem que ser");
                                    System.out.println(elogio);
                                } else {
                                    System.out.println("Rafael Arduini: a resolução do problema foi correta, mas o principal");
                                    System.out.println("detalhe não foi passado, que o celular que vai fazer o check-in");
                                    System.out.println("tem que estar conectado a mesma Wifi da SmartTV que está como Residência Netflix");
                                    System.out.println("Levou aquele RCR de milhões pq a cliente entrou pelos dados móveis.");
                                }
                            }
                        } else { // PRIMEIRO ELSE DO 2
                            System.out.println("Cliente: quase todos os dias eu vou na minha loja.");
                            System.out.println("1- Agente: Você pode fazer um check-in pra habilitar sua Netflix na loja.");
                            System.out.println("2- " + assinanteExtra);
                            System.out.println(menuResposta);
                            respostaAgente = scanner.nextInt();
                            if (respostaAgente == 1) {
                                System.out.println("Cliente: o que é check-in?");
                                System.out.println("1- Agente: explicar em detalhes o check-in.");
                                System.out.println("2- Agente: é só entrar na Netflix pelo celular na sua casa e depois entrar na loja");
                                System.out.println(menuResposta);
                                respostaAgente = scanner.nextInt();
                                if (respostaAgente == 1) {
                                    System.out.println(checkIn);
                                    System.out.println("Rafael Arduini: parabéns, alinhou com cliente direitinho.");
                                    System.out.println("Contato rápido, com contexto e Objetivo, TMA baixo do jeito que tem que ser");
                                    System.out.println(elogio);
                                } else {
                                    System.out.println("Rafael Arduini: a resolução do problema foi correta, mas o principal");
                                    System.out.println("detalhe não foi passado, que o celular que vai fazer o check-in");
                                    System.out.println("tem que estar conectado a mesma Wifi da SmartTV que está como Residência Netflix");
                                    System.out.println("Levou aquele RCR de milhões pq a cliente entrou pelos dados móveis.");
                                } // FIM DO IF DO SEGUNDO ELSE DO 2
                            } else {
                                System.out.println("Rafael Arduini: O Assinante extra resolveria o problema dela,");
                                System.out.println("porém ela tem duas TVs Smarts e precisaria fazer 2 Assinantes extras...");
                                System.out.println("Um simples check-in resolveria a situação dela");
                                System.out.println(detalheInvestigacao);
                            }
                        } // FIM DO PRIMEIRO ELSE DO 2
                    }
                    setContaAtiva(false); // Ou outra condição para encerrar o loop
                } else {//ESSE ELSE É PARA O SORTEIO COM NÚMERO 5
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

