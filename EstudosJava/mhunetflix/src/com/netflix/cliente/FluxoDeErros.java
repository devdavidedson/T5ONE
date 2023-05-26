package com.netflix.cliente;

public class FluxoDeErros extends ErrosCliente {

    public void primeiroErro(Cliente cliente) {
        System.out.println(cliente.getNome() + getErro1());
        System.out.println("1- " + cliente.getAgente() + getInvestigar1());
        System.out.println("2- " + cliente.getAgente() + getInvestigar2());
        System.out.println(getMenuResposta());
        setRespostaAgente();
        //primeiro laço.
        if (getRespostaAgente() == 1) { //primeiro IF do 1
            System.out.println(cliente.getNome() + ": Sou eu a dona da conta.\n");
            System.out.println("1- " + cliente.getAgente() + getInvestigar2());
            System.out.println("2- " + cliente.getAgente() + getResidenciaNetflix());
            System.out.println(getMenuResposta());
            setRespostaAgente();
            //primeiro laço interno
            if (getRespostaAgente() == 1) { // segundo IF do 1
                System.out.println(cliente.getNome() + ": Eu e minha mãe usamos, ela tem um ponto na casa dela.\n");
                System.out.println("1- " + cliente.getAgente() + getResidenciaNetflix());
                System.out.println("2- " + cliente.getAgente() + getAssinanteExtra());
                System.out.println(getMenuResposta());
                setRespostaAgente();
                if (getRespostaAgente() == 1) { //terceiro IF do 1
                    System.out.println(cliente.getNome() + ": Como eu faço pra voltar a assistir?");
                    System.out.println("\n1-" + cliente.getAgente() + ": Nós podemos definir sua TV como localização principal, e fazer um assinante Extra pra sua mãe.");
                    System.out.println("2- " + cliente.getAgente() + ": Vamos lá vou te ajudar a criar o assinante extra.");
                    System.out.println(getMenuResposta());
                    setRespostaAgente();
                    if (getRespostaAgente() == 1) { // QUARTO IF do 1
                        System.out.println(cliente.getNome() + ": OK! vamos fazer isso então...");
                        System.out.println(cliente.getAgente() + getEncerramento());
                        System.out.println("\nRafael Arduini: PARABÉNS, alinhou certinho com a cliente.");
                        System.out.println("Você colocou o Titular como Residência Netflix e fez o Assinante extra para a mãe!");
                        System.out.println(getElogio());
                    } else if (getRespostaAgente() == 2){ // QUARTO ELSE do 1
                        System.out.println(cliente.getNome() + ": Sim vamos criar um por favor!");
                        System.out.println("\nRafael Arduini: Aqui você cria o assinante extra de forma majestosa.");
                        System.out.println("Porém toma um RCR de MILHÕES por que não ajustou a Residência Netflix.");
                        System.out.println("Ela era a Titular da conta e criou no email da mãe dela e mesmo assim não conseguiu acesso");
                        System.out.println("***MUITA atenção as perguntas de investigação***");
                    }
                } else if (getRespostaAgente() == 2) { //TERCEIRO ELSE DO 1
                    System.out.println(cliente.getAgente() + getAssinanteExtraExplicacao());
                    System.out.println("1- " + cliente.getAgente() + ": Você quer criar o Assinante extra?");
                    System.out.println("2- " + cliente.getAgente() + ": Ou você pode ficar assistindo de aparelhos móveis que é liberado.");
                    System.out.println(getMenuResposta());
                    setRespostaAgente();
                    if (getRespostaAgente() == 1) { // TERCEIRO ELSE DO 1 primeiro IF
                        System.out.println(cliente.getNome() + ": Sim vamos criar um por favor!");
                        System.out.println("\nRafael Arduini: Aqui você cria o assinante extra de forma majestosa.");
                        System.out.println("Porém toma um RCR de MILHÕES por que não ajustou a Residência Netflix.");
                        System.out.println("Ela era a Titular da conta e criou no email da mãe e mesmo assim não conseguiu acesso");
                        System.out.println("por que a mãe dela que deveria ser a Assinante Extra.");
                        System.out.println(getDetalheInvestigacao());
                    } else if (getRespostaAgente() == 2) { // TERCEIRO ELSE DO 1 PRIMEIRO ELSE
                        System.out.println("Rafael Arduini: Você deve se atentar que a cliente ligou com erro");
                        System.out.println("de Residência Netflix > Localização principal, então ela quer");
                        System.out.println("Assistir na TV. (APARELHO MÓVEL NÃO PRECISA DE LOCALIZAÇÃO!");
                        System.out.println(getDetalheInvestigacao());
                    }
                }

            } else if (getRespostaAgente() == 2) { // SEGUNDO ELSE DO 1
                System.out.println(cliente.getNome() + ": Eu e minha mãe usamos, mas na casa dela ta NORMAL!\n");
                System.out.println("1- " + cliente.getAgente() + ": Então podemos criar um Assinante extra para ela e definir você como localização principal.");
                System.out.println("2- " + cliente.getAgente() + getAssinanteExtra());
                System.out.println("3- " + cliente.getAgente() + getLocalizacaoPrincipal());
                System.out.println("digite 1, 2 ou 3 para selecionar a opção");
                setRespostaAgenteOpcional();
                if (getRespostaAgente() == 1) {
                    System.out.println("Rafael Arduini: Parabéns, conseguiu ajudar o cliente da melhor forma!");
                    System.out.println("Colocou a Titular como Residência Netflix e os demais como Assinante Extra.");
                    System.out.println(getElogio());
                } else if (getRespostaAgente() == 2) {
                    System.out.println(cliente.getNome() + ": Sim vamos criar um por favor!");
                    System.out.println("\nRafael Arduini: Aqui você cria o assinante extra de forma majestosa.");
                    System.out.println("Porém toma um RCR de MILHÕES por que não ajustou a Residência Netflix.");
                    System.out.println("Ela era a Titular da conta e criou no email da mãe e mesmo assim não conseguiu acesso");
                    System.out.println("por que a mãe dela que deveria ser a Assinante Extra.");
                    System.out.println(getDetalheInvestigacao());
                } else if (getRespostaAgente() == 3) {
                    System.out.println(cliente.getNome() + ": Sim me ajude por favor!");
                    System.out.println("\nRafael Arduini: Aqui você cria o assinante extra de forma majestosa.");
                    System.out.println("Porém toma um RCR de MILHÕES por que não ajustou a Residência Netflix.");
                    System.out.println("Ela era a Titular da conta e criou no email da mãe e mesmo assim não conseguiu acesso");
                    System.out.println("por que a mãe dela que deveria ser a Assinante Extra.");
                    System.out.println(getDetalheInvestigacao());
                } // Final do primeiro laço internet.
            }
            //final do primeiro laço
        } else if (getRespostaAgente() == 2) { // PRIMEIRO ELSE DO LAÇO 2
            System.out.println(cliente.getNome() + ": Assiste eu na minha casa e minha mãe na casa dela, mas moça na minha mãe ta NORMAL!");
            System.out.println("1- " + cliente.getAgente() + getResolucao1de1());
            System.out.println("2- " + cliente.getAgente() + getInvestigar1());
            System.out.println(getMenuResposta());
            setRespostaAgente();
            if (getRespostaAgente() == 1) { //PRIMEIRO IF DO 2
                System.out.println(cliente.getNome() + ": minha mãe não sabe nem usar o controle direito, quem dirá definir alguma coisa...\n");
                System.out.println("1- " + cliente.getAgente() + ": o que posso fazer é te ajudar a definir a Residência Netflix para que você volte a assistir");
                System.out.println("2- " + cliente.getAgente() + ": Como o endereço dela está definido como Residência, posso te ajudar a trocar a localização e criar um assinante extra.");
                System.out.println(getMenuResposta());
                setRespostaAgente();
                if (getRespostaAgente() == 1) { // SEGUNDO IF DO 2
                    System.out.println( cliente.getNome() + ": então avia que eu quero assistir\n");
                    System.out.println( cliente.getAgente() + getResolucaoResidencia());
                    System.out.println("\nRafael Arduini: Você Ajuda o cliente a definir a localição principal dele");
                    System.out.println("Toma aquele recontato de milhões por deixar a mãe dele sem acesso.");
                    System.out.println(getDetalheInvestigacao());
                } else if (getRespostaAgente() == 2) {
                    System.out.println(cliente.getNome() + ": Ai se eu fizer assinante extra vou poder assistir eu e ela?\n");
                    System.out.println(cliente.getAgente() + getAssinanteExtraExplicacao());
                    System.out.println(cliente.getNome() + ": ficou tudo explicadinho, então vou fazer um assinante extra, mas vai ser no email dela.");
                    System.out.println(cliente.getAgente() + getResolucaoResidencia());
                    System.out.println(getElogio());
                }//final do segundo laço interno.
            } else if (getRespostaAgente() == 2) { // PRIMEIRO ELSE DO 2
                System.out.println(cliente.getNome() + ": Eu sou titular, minha mãe usa minha Netflix na casa dela.\n");
                System.out.println("1- " + cliente.getAgente() + getAssinanteExtra());
                System.out.println("2- " + cliente.getAgente() + ": Como o endereço dela está definido como Residência, posso te ajudar a trocar a localização e criar um assinante extra.");
                System.out.println(getMenuResposta());
                setRespostaAgente();
                if (getRespostaAgente() == 1) {
                    System.out.println(cliente.getNome() + ": tá bom, vamos criar o assinante extra então.");
                    System.out.println("\nRafael Arduini: Você Ajuda o cliente a criar o assinante Extra.");
                    System.out.println("Toma aquele recontato de milhões por não perceber que é no email da mãe dela e a principal ta lá!");
                    System.out.println(getDetalheInvestigacao());
                } else if (getRespostaAgente() == 2) {
                    System.out.println("Rafael Arduini: Arrumou Localização e criou assinante Extra, contato certinho, perfeito!");
                    System.out.println("Deixou a titular como Residência Netflix e os demais com Assinante extra!");
                    System.out.println(getElogio());
                }
            }
            //End error1
        }
    }

    public void segundoErro(Cliente cliente) {
        System.out.println(cliente.getNome() + getErro2());
        System.out.println("1- " + cliente.getAgente() + getInvestigar3());
        System.out.println("2- " + cliente.getAgente() + getInvestigar4());
        System.out.println(getMenuResposta());
        setRespostaAgente();
        if (getRespostaAgente() == 1) {
            System.out.println(cliente.getNome() + ": Eu pretendo ficar por volta de 1 mês lá.\n");
            System.out.println("1- " + cliente.getAgente() + "É preciso fazer o check-in antes de sair de casa ta?");
            System.out.println("2- " + cliente.getAgente() + "Em quais aparelhos você pretende assistir na viajem?");
            System.out.println(getMenuResposta());
            setRespostaAgente();
            if (getRespostaAgente() == 1) {
                System.out.println(cliente.getNome() + ": Como eu faço para realizar o procedimento.\n");
                System.out.println(cliente.getAgente() + getCheckIn());
                System.out.println(cliente.getNome() + ": O que é Residência Netflix? Tem que fazer isso tudo pra assistir A MINHA NETFLIX?!");
                System.out.println("\n1- " + cliente.getAgente() + ": O Wifi que sua SmartTV está conectada é definido como sua Residência Netflix");
                System.out.println("2- " + cliente.getAgente()+  ": Calma senhora, você pode optar por fazer um Assinante Extra.");
                System.out.println(getMenuResposta());
                setRespostaAgente();
                if (getRespostaAgente() == 1) {
                    System.out.println(cliente.getNome() + ": mas eu só assisto por aparelhos móveis, meu filho usa o Tablet e eu vou viajar com o Note");
                    System.out.println(cliente.getNome() + ": Olha o aborrecimento já está grande demais, cancele minha Netflix por favor...");
                    System.out.println(cliente.getNome() + ": Nem se vocês me derem de graça eu quero mais.");

                    if (getRespostaAgente() == 1) {
                        System.out.println(cliente.getNome() + ": A Netflix caiu muito de qualidade, eu vou entrar judicialmente por que antes não existia isso.\n");
                        System.out.println(cliente.getAgente() + ": É necessário fazer o check-in antes de sair de casa ta? É algo do sistema!");
                        System.out.println(cliente.getNome() + ":Eu já desisti de assiste em viajem. vou cancelar depois.");
                        System.out.println(cliente.getAgente() + ": Te ajudo em algo mais?");
                        System.out.println("\nRafael Arduini: Lembrem-se de fazer sempre as perguntas corretas de investigação");
                        System.out.println("Perguntar em que aparelhos assistir, deve ser a maior prioridade em todas as situações");
                    } else if (getRespostaAgente() == 2) {
                        System.out.println(cliente.getNome() + ": O Que danado é assinante extra? eu vou ter que pagar denovo pra assistir viajando?");
                        System.out.println(cliente.getNome() + ": mas eu só assisto por aparelhos móveis, meu filho usa o Tablet e eu vou viajar com o Note");
                        System.out.println(cliente.getNome() + ": Olha o aborrecimento já está grande demais, cancele minha Netflix por favor...");
                        System.out.println(cliente.getNome() + ": Nem se vocês me derem de graça eu quero mais.");
                        System.out.println("\nRafael Arduini: Lembrem-se de fazer sempre as perguntas corretas de investigação");
                        System.out.println("Perguntar em que aparelhos assistir, deve ser a maior prioridade em todas as situações");
                    }
                } else if (getRespostaAgente() == 2) {
                    System.out.println(cliente.getNome() + ": Ja veio novamente com a história de pagar pra assistir a minha Netflix?");
                    System.out.println(cliente.getNome() + ": O que danado é esse Assinante extra?");
                    System.out.println( + cliente.getAgente() + getAssinanteExtraExplicacao());
                    System.out.println(cliente.getNome() + ": Você disse 1 kilo eu num entendi 1 grama. Cancele logo a Netflix!");
                    System.out.println("\nRafael Arduini: Lembrem-se de fazer sempre as perguntas corretas de investigação");
                    System.out.println("Perguntar em que aparelhos assistir, deve ser a maior prioridade em todas as situações");
                }
            }  else if (getRespostaAgente() == 2) {
                System.out.println(cliente.getNome() + ": Só vou assistir no notebook e no tablet.\n");
                System.out.println(cliente.getAgente() + ": Pode ir tranquilo e assistir normalmente a sua Netflix!\n");
                System.out.println(cliente.getNome() + ": muito obrigado pela informação meu amigo, já estava preocupado com minha serie.\n");
                System.out.println(cliente.getAgente() + getEncerramento());
            }
        } else if (getRespostaAgente() == 2) {
            System.out.println(cliente.getNome() + ": Só vou assistir no notebook e no tablet.\n");
            System.out.println(cliente.getAgente() + ": Pode ir tranquilo e assistir normalmente a sua Netflix!\n");
            System.out.println(cliente.getNome() + ": muito obrigado pela informação meu amigo, já estava preocupado com minha serie.\n");
            System.out.println(cliente.getAgente() + getEncerramento());
        }
        // END ERRO 2
    }
    public void terceiroErro(Cliente cliente) {
        System.out.println(cliente.getNome() + getErro3());
        System.out.println("1- " + cliente.getAgente() + getInvestigar1());
        System.out.println("2- " + cliente.getAgente() + getInvestigar6());
        System.out.println(getMenuResposta());
        setRespostaAgente();
        if (getRespostaAgente() == 1) {//PRIMEIRO IF
            System.out.println(cliente.getNome() + ": Eu sou o titular da conta e minha irmã e minha mãe usam uma tela cada.");
            System.out.println("1- " + cliente.getAgente() + ": Vocês usam no mesmo Wifi?");
            System.out.println("2- " + cliente.getAgente() + ": Se a Netflix definir a SmartTV da sua irmã como principal, você perderá acesso na sua TV.");
            System.out.println(getMenuResposta());
            setRespostaAgente();
            if (getRespostaAgente() == 1) {
                System.out.println(cliente.getNome() + ": Sim! moramos juntas na mesma casa.");
                System.out.println("1- " + cliente.getAgente() + ": então não existe problema nenhum, podem assistir a vontade!");
                System.out.println("2- " + cliente.getAgente() + getAssinanteExtra());
                System.out.println(getMenuResposta());
                setRespostaAgente();
                if (getRespostaAgente() == 1) {
                    System.out.println("Rafael Arduini: Parabéns, é muito importante Observar que elas moram juntas e no mesmo WIFI");
                    System.out.println("Quando tem relação entre Wifi + smartTV + aparelho, é definido uma Residência Netflix.");
                    System.out.println("logo todos os aparelhos que ali se conectam, tem acesso a conta do Titular!");
                    System.out.println(getElogio());
                } else if (getRespostaAgente() == 2) {
                    System.out.println(cliente.getNome() + ": me explica direitinho o que é assinante Extra!");
                    System.out.println("1- " + cliente.getAgente() + getAssinanteExtraExplicacao());
                    System.out.println("2- " + cliente.getAgente() + ": Podemos também resolver com a localização principal na Residência Netflix.");
                    System.out.println(getMenuResposta());
                    setRespostaAgente();
                    if (getRespostaAgente() == 1) {
                        System.out.println("Rafael Arduini: Devemos sempre nos atentar as perguntas investigativas, porém");
                        System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                        System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                        System.out.println("logo nada deve ser feito!");
                        System.out.println(getDetalheInvestigacao());
                    } else if (getRespostaAgente() == 2) {
                        System.out.println("Rafael Arduini: Devemos sempre nos atentar as perguntas investigativas, porém");
                        System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                        System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                        System.out.println("logo nada deve ser feito!");
                        System.out.println(getDetalheInvestigacao());
                    }
                }
            } else if (getRespostaAgente() == 2) {
                System.out.println(cliente.getNome() + ": me explica direitinho o que é assinante Extra!");
                System.out.println("1- " + cliente.getAgente() + getAssinanteExtraExplicacao());
                System.out.println("2- " + cliente.getAgente() + ": Podemos também resolver com a localização principal na Residência Netflix.");
                System.out.println(getMenuResposta());
                setRespostaAgente();
                if (getRespostaAgente() == 1) {
                    System.out.println("Rafael Arduini: Devemos sempre nos atentar as perguntas investigativas, porém");
                    System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                    System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                    System.out.println("logo nada deve ser feito!");
                    System.out.println(getDetalheInvestigacao());
                } else if (getRespostaAgente() == 2) {
                    System.out.println("Rafael Arduini: Devemos sempre nos atentar as perguntas investigativas, porém");
                    System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                    System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                    System.out.println("logo nada deve ser feito!");
                    System.out.println(getDetalheInvestigacao());
                }
            }
        } else if (getRespostaAgente() == 2) { //primeiro ELSE
            System.out.println(cliente.getNome() + ": Ela e eu usamos na SmartTV e minha mãe no celular.");
            System.out.println("1- " + cliente.getAgente() + getInvestigar1());
            System.out.println("2- " + cliente.getAgente() + ": Vocês usam no mesmo Wifi?");
            System.out.println(getMenuResposta());
            setRespostaAgente();
            if (getRespostaAgente() == 1) {
                System.out.println(cliente.getNome() + ": Eu sou o titular da conta e minha irmã e minha mãe usam uma tela cada.");
                System.out.println("1- " + cliente.getAgente() + ": Vocês usam no mesmo Wifi?");
                System.out.println("2- " + cliente.getAgente() + ": Se a Netflix definir a SmartTV da sua irmã como principal, você perderá acesso na sua TV.");
                System.out.println(getMenuResposta());
                setRespostaAgente();
                if (getRespostaAgente() == 1) {
                    System.out.println(cliente.getNome() + ": Sim! moramos juntas na mesma casa.");
                    System.out.println("1- " + cliente.getAgente() + ": então não existe problema nenhum, podem assistir a vontade!");
                    System.out.println("2- " + cliente.getAgente() + getAssinanteExtra());
                    System.out.println(getMenuResposta());
                    setRespostaAgente();
                    if (getRespostaAgente() == 1) {
                        System.out.println("Rafael Arduini: Parabéns, é muito importante Observar que elas moram juntas e no mesmo WIFI");
                        System.out.println("Quando tem relação entre Wifi + smartTV + aparelho, é definido uma Residência Netflix.");
                        System.out.println("logo todos os aparelhos que ali se conectam, tem acesso a conta do Titular!");
                        System.out.println(getElogio());
                    } else if (getRespostaAgente() == 2) {
                        System.out.println("Rafael Arduini: Gente, a resolução já foi dada!");
                        System.out.println("Devemos sempre nos atentar as perguntas investigativas, porém");
                        System.out.println("temos que ver as respostas, cliente disse que todos os aparelhos estão");
                        System.out.println("conectados a mesma rede Wifi, então ele compoe uma Residência Netflix...");
                        System.out.println("logo nada deve ser feito!");
                        System.out.println(getDetalheInvestigacao());
                    }
                } else if (getRespostaAgente() == 2) {
                    System.out.println(cliente.getNome() + ": E o que eu posso fazer pra evitar esse cenário?");
                    System.out.println("1- " + cliente.getAgente() + getAssinanteExtra());
                    System.out.println("2- " + cliente.getAgente() + ": Podemos também, definir a sua TV como principal para Residência Netflix!");
                    System.out.println(getMenuResposta());
                    setRespostaAgente();
                    if (getRespostaAgente() == 1) {
                        System.out.println("Rafael Arduini: Devemos sempre nos atentar as perguntas investigativas, porém");
                        System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                        System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                        System.out.println("logo nada deve ser feito!");
                        System.out.println(getDetalheInvestigacao());
                    } else if (getRespostaAgente() == 2) {
                        System.out.println("Rafael Arduini: Devemos sempre nos atentar as perguntas investigativas, porém");
                        System.out.println("temos que ver as respostas, cliente estava com todos os aparelhos");
                        System.out.println("conectados a mesma rede Wifi, então eles compõem uma Residência Netflix...");
                        System.out.println("logo nada deve ser feito!");
                        System.out.println(getDetalheInvestigacao());
                    }
                }
            } else if (getRespostaAgente() == 2) {
                System.out.println(cliente.getNome() + ": Sim! moramos juntas na mesma casa.");
                System.out.println("1- " + cliente.getAgente() + ": então não existe problema nenhum, podem assistir a vontade!");
                System.out.println("2- " + cliente.getAgente() + getAssinanteExtra());
                System.out.println(getMenuResposta());
                setRespostaAgente();
                if (getRespostaAgente() == 1) {
                    System.out.println("Rafael Arduini: Parabéns, é muito importante Observar que elas moram juntas e no mesmo WIFI");
                    System.out.println("Quando tem relação entre Wifi + smartTV + aparelho, é definido uma Residência Netflix.");
                    System.out.println("logo todos os aparelhos que ali se conectam, tem acesso a conta do Titular!");
                    System.out.println(getElogio());
                } else if (getRespostaAgente() == 2) {
                    System.out.println("Rafael Arduini: Gente, a resolução já foi dada!");
                    System.out.println("Devemos sempre nos atentar as perguntas investigativas, porém");
                    System.out.println("temos que ver as respostas, cliente disse que todos os aparelhos estão");
                    System.out.println("conectados a mesma rede Wifi, então ele compoe uma Residência Netflix...");
                    System.out.println("logo nada deve ser feito!");
                    System.out.println(getDetalheInvestigacao());
                }
            }
        }//FIM do FLUXO
    }
    private void quartoErro(Cliente cliente) {
        System.out.println(getErro4());
        System.out.println("1- " + getInvestigar5());
        System.out.println("2- " + getInvestigar4());
        System.out.println(getMenuResposta());
        setRespostaAgente();
        if (getRespostaAgente() == 1) { //PRIMEIRO IF DO 1
            System.out.println("Cliente: o que é check-in?");
            System.out.println("1- " + getAgente() + ": explicar em detalhes o check-in.");
            System.out.println("2- " + getAgente() + ": é só entrar na Netflix pelo celular na sua casa e depois entrar na loja");
            System.out.println(getMenuResposta());
            setRespostaAgente();
            if (getRespostaAgente() == 1) { // SEGUNDO IF DO 1
                System.out.println(getCheckIn());
                System.out.println("Rafael Arduini: parabéns, alinhou com cliente direitinho.");
                System.out.println("Contato rápido, com contexto e Objetivo, TMA baixo do jeito que tem que ser");
                System.out.println(getElogio());
            } else if (getRespostaAgente() == 2) { // SEGUNDO ELSE DO 1
                System.out.println("Rafael Arduini: a resolução do problema foi correta, mas o principal");
                System.out.println("detalhe não foi passado, que o celular que vai fazer o check-in");
                System.out.println("tem que estar conectado a mesma Wifi da SmartTV que está como Residência Netflix");
                System.out.println("Levou aquele RCR de milhões pq a cliente entrou pelos dados móveis.");
            } // FIM DO FLUXO 1
        } else if (getRespostaAgente() == 2) { // INICIO ELSE DO 2
            System.out.println("Cliente: tenho duas TVs Smart.");
            System.out.println("1- " + getAgente() + ": na sua casa você usa em quais aparelhos?");
            System.out.println("2- " + getAgente() + ": de quanto em quanto tempo você vai na sua loja?");
            System.out.println(getMenuResposta());
            setRespostaAgente();
            if (getRespostaAgente() == 1) { // PRIMEIRO IF DO 2
                System.out.println("Na minha casa eu uso na TV e no tablet, quem assiste é meu filho.");
                System.out.println("1- " + getAgente() + ": podemos mudar a localização principal da Residência Netflix para o trabalho.");
                System.out.println("2- " + getAgente() + ": podemos fazer um check-in.");
                System.out.println(getMenuResposta());
                setRespostaAgente();
                if (getRespostaAgente() == 1) { //SEGUNDO IF INTERNO DO 2
                    System.out.println("Rafael Arduini: Nesse caso a mudança de localização não se aplica.");
                    System.out.println("Se ele mudar a localização da Residência Netflix, ele perderá o acesso em casa");
                    System.out.println(getDetalheInvestigacao());
                } else if (getRespostaAgente() == 2) { // SEGUNDO ELSE INTERNO DO 2
                    System.out.println("Cliente: o que é check-in?");
                    System.out.println("1- " + getAgente() + ": explicar em detalhes o check-in.");
                    System.out.println("2- " + getAgente() + ": é só entrar na Netflix pelo celular na sua casa e depois entrar na loja");
                    System.out.println(getMenuResposta());
                    setRespostaAgente();
                    if (getRespostaAgente() == 1) {
                        System.out.println(getCheckIn());
                        System.out.println("Rafael Arduini: parabéns, alinhou com cliente direitinho.");
                        System.out.println("Contato rápido, com contexto e Objetivo, TMA baixo do jeito que tem que ser");
                        System.out.println(getElogio());
                    } else if (getRespostaAgente() == 2) {
                        System.out.println("Rafael Arduini: a resolução do problema foi correta, mas o principal");
                        System.out.println("detalhe não foi passado, que o celular que vai fazer o check-in");
                        System.out.println("tem que estar conectado a mesma Wifi da SmartTV que está como Residência Netflix");
                        System.out.println("Levou aquele RCR de milhões pq a cliente entrou pelos dados móveis.");
                    }
                }
            } else if (getRespostaAgente() == 2) { // PRIMEIRO ELSE DO 2
                System.out.println("Cliente: quase todos os dias eu vou na minha loja.");
                System.out.println("1- " + getAgente() + ": Você pode fazer um check-in pra habilitar sua Netflix na loja.");
                System.out.println("2- " + getAssinanteExtra());
                System.out.println(getMenuResposta());
                setRespostaAgente();
                if (getRespostaAgente() == 1) {
                    System.out.println("Cliente: o que é check-in?");
                    System.out.println("1- " + getAgente() + ": explicar em detalhes o check-in.");
                    System.out.println("2- " + getAgente() + ": é só entrar na Netflix pelo celular na sua casa e depois entrar na loja");
                    System.out.println(getMenuResposta());
                    setRespostaAgente();
                    if (getRespostaAgente() == 1) {
                        System.out.println(getCheckIn());
                        System.out.println("Rafael Arduini: parabéns, alinhou com cliente direitinho.");
                        System.out.println("Contato rápido, com contexto e Objetivo, TMA baixo do jeito que tem que ser");
                        System.out.println(getElogio());
                    } else if (getRespostaAgente() == 2) {
                        System.out.println("Rafael Arduini: a resolução do problema foi correta, mas o principal");
                        System.out.println("detalhe não foi passado, que o celular que vai fazer o check-in");
                        System.out.println("tem que estar conectado a mesma Wifi da SmartTV que está como Residência Netflix");
                        System.out.println("Levou aquele RCR de milhões pq a cliente entrou pelos dados móveis.");
                    } // FIM DO IF DO SEGUNDO ELSE DO 2
                } else if (getRespostaAgente() == 2) {
                    System.out.println("Rafael Arduini: O Assinante extra resolveria o problema dela,");
                    System.out.println("porém ela tem duas TVs Smarts e precisaria fazer 2 Assinantes extras...");
                    System.out.println("Um simples check-in resolveria a situação dela");
                    System.out.println(getDetalheInvestigacao());
                }
            } // FIM DO PRIMEIRO ELSE DO 2
        }
    }
    public void iniciaLigacao(Cliente cliente) {
    while (cliente.getContaAtiva()) {
        if (getSorteio() == 1) {
            primeiroErro(cliente);
            cliente.setContaAtiva(false);
        } else if (getSorteio() == 2) {
            segundoErro(cliente);
            cliente.setContaAtiva(false);
        } else if (getSorteio() == 3) {
            terceiroErro(cliente);
            cliente.setContaAtiva(false);
        } else if (getSorteio() == 4) {
            quartoErro(cliente);
            cliente.setContaAtiva(false);
        } else if (getSorteio() == 5) {//ESSE ELSE É PARA O SORTEIO COM NÚMERO 5
            System.out.println(getErro5());
            System.out.println("1- " + getInvestigar7());
            System.out.println("2- " + getInvestigar8());
            System.out.println(getMenuResposta());
            setRespostaAgente();
            if ( getRespostaAgente() == 1) {
                System.out.println("resposta de continuação vindo....");
            } else {
                System.out.println("resposta de continuação vindo....");
            }
            setContaAtiva(false); // Ou outra condição para encerrar o loop
        } else {
            System.out.println("Disturbio na força! Recarregue a Aplicação.");
            cliente.setContaAtiva(false); // Ou outra condição para encerrar o loop
        }
    }
}

}
