package com.netflix.cliente;

import java.util.Random;
import java.util.Scanner;

public class ErrosCliente extends Cliente {
    Scanner scanner = new Scanner(System.in);
    private int sorteio = new Random().nextInt(6)+1;
    private String menuResposta = "\ndigite 1 ou 2 para selecionar opção:";
    private int respostaAgente = 0;
    private String erro1 = """
            : Estou com um erro na minha Netflix, aparece que eu não estou na
            localização principal, fala que não é minha Residência. Mas aqui é a
            minha residência! Eu sempre assisti daqui.
            """;
    private String erro2 = """
            : Eu preciso viajar e recebi um email que vou ter que assinar novamente
            a Netflix pra poder assistir fora da minha casa! Nunca vi me cobrar para
            eu ter que assistir na minha própria Netflix...
            """;
    private String erro3 = ": Minha irmã usa minha Netflix, eu vou ter que fazer um assinante extra?";
    private String erro4 = """
            : Eu uso a Netflix que assinei aqui pra casa, na minha Loja,
            agora não vou poder mais usar?!
            """;
    private String erro5 = ": Oi tudo bem? Estou com um erro na hora de vincular um Assinante Extra.";
    private String erro6 = """
            : Eu liguei anteriormente para vocês e me falaram que o assinante extra, só
            poderia vincular 2 contas por cobrança ou período de cobrança. Então eu quero
            cancelar meu Assinante extra e receber meu reembolso! Não posso pagar por algo
            que não irei usar,veja que absurdo não foi sequer me dado um aviso de que eram apenas 2!
            """;

    private String investigar1 = ": Quem é o titular da conta Netflix?";
    private String investigar2 = ": Mais alguém usa a sua conta Netflix?";
    private String investigar3 = ": Quanto tempo você pretende ficar viajando? É pra dentro do País?";
    private String investigar4 = ": Quais são os aparelhos em que você irá assistir?";
    private String investigar5 = ": Basta fazer um check-in?";
    private String investigar6 = ": Em que aparelhos você e sua irmã usam a Netflix?";
    private String investigar7 = ": Você já cancelou adiado, não posso fazer nada a respeito!";
    private String investigar8 = ": Na sua casa, quais aparelhos você assiste?";
    private String investigar9 = ": Qual plano você possui?";
    private String investigar10 = ": Qual nome do erro que está aparecendo?";
    private String obiwanAssinanteEXTRA = ": **Obiwan:**\n**Email do CLIENTE definido como Assinante EXTRA.**\n";
    private String obiwanTitular = ": **Obiwan:**\n**Email do CLIENTE definido como Titular da conta.**\n";

    private String resolucao1de1 = ":Sua mãe deve ter definido o endereço dela como sendo o principal da conta.";

    private String residenciaNetflix = ": Foi colocado em outra Smart TV como sendo a Residencia Netflix, por isso que você não consegue acessar.";
    private String resolucaoResidencia = ": Só precisamos colocar sua SMART-TV como Localização principal na Residência Netflix (KB 128777).";
    private String assinanteExtra = ": podemos criar um assinante extra. (KB 124633)";
    private String localizacaoPrincipal = ": Posso ajudar você a definir sua localização principal.";
    private String checkIn = """
            : Para fazer o check-in você precisa entrar na Netflix no WiFi onde sua Smart TV definiu Residência Netflix
            depois é só ir na local onde precisa liberar, conectar seu Celular no Wifi de lá e entrar na Netflix no celular.
            Pronto, depois desse processo você pode usar normalmente. Lembrando que tem que ser algo periódico.""";
    private String assinanteExtraExplicacao ="""
            : o assinante extra é uma conta extra dentro da sua conta, onde
            o "agregado" vai criar a conta dele com email dele e vincular a sua conta.
                        
            Precisa ser plano Padrão ou Premium,
            1 extra para o Padrão e 2 pro Premium:
            - não pode ser cliente Ativo da Netflix (Que tenha conta Netflix em uso).
            - não pode ter assinante extra com perfil infantil.
            o extra pode tanto escolher criar um perfil novo ou transferir de alguma conta um já existente!""";
    private String elogio = "\nESSE ATENDIMENTO NÃO TEVE RCR E ESTÁ COM 100% DE CRES E CSAT.";
    private String detalheinvestigacao = "\n***MUITA ATENÇÃO aos detalhes e perguntas investigativas para o Cliente!***";
    private String encerramento = """
            : Cliente, volta para tela da nossa chamada aí!...
            Voltou? Ótimo, pode deixar que eu encerro por aqui. Tchau.""";


    public int getRespostaAgente() {
        return respostaAgente;
    }

    public void setRespostaAgente() {
        this.respostaAgente = scanner.nextInt();
        if (respostaAgente == 1) {
           this.respostaAgente = 1;
        } else if (respostaAgente == 2) {
            this.respostaAgente = 2;
        } else {
            System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            System.out.println("digite 1 ou 2 para selecionar opção:");
            setRespostaAgente(); // Solicita novamente a resposta do usuário
        }
    }
    public void setRespostaAgenteOpcional() {
        this.respostaAgente = scanner.nextInt();
        if (respostaAgente == 1) {
            this.respostaAgente = 1;
        } else if (respostaAgente == 2) {
            this.respostaAgente = 2;
        } else if (respostaAgente == 3) {
            this.respostaAgente = 3;
        } else {
            System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            System.out.println("digite 1 ou 2 para selecionar opção:");
            setRespostaAgente(); // Solicita novamente a resposta do usuário
        }
    }





    public int getSorteio() {
        return sorteio;
    }
    public String getMenuResposta() {
        return menuResposta;
    }

    public String getErro1() {
        return erro1;
    }
    public String getErro2() {
        return erro2;
    }
    public String getErro3() {
        return erro3;
    }
    public String getErro4() {
        return erro4;
    }
    public String getErro5() {
        return erro5;
    }
    public String getErro6() {
        return erro6;
    }

    public String getInvestigar1() {
        return investigar1;
    }
    public String getInvestigar2() {
        return investigar2;
    }
    public String getInvestigar3() {
        return investigar3;
    }
    public String getInvestigar4() {
        return investigar4;
    }
    public String getInvestigar5() {
        return investigar5;
    }
    public String getInvestigar6() {
        return investigar6;
    }
    public String getInvestigar7() {
        return investigar7;
    }
    public String getInvestigar8() {
        return investigar8;
    }
    public String getInvestigar9() {
        return investigar9;
    }
    public String getInvestigar10() {
        return investigar10;
    }
    public String getObiwanAssinanteEXTRA() {
        return obiwanAssinanteEXTRA;
    }
    public String getObiwanTitular() {
        return obiwanTitular;
    }


    public String getResolucao1de1() {
        return resolucao1de1;
    }
    public String getResidenciaNetflix() {
        return residenciaNetflix;
    }
    public String getResolucaoResidencia() {
        return resolucaoResidencia;
    }
    public String getAssinanteExtra() {
        return assinanteExtra;
    }
    public String getLocalizacaoPrincipal() {
        return localizacaoPrincipal;
    }
    public String getCheckIn() {
        return checkIn;
    }
    public String getAssinanteExtraExplicacao() {
        return assinanteExtraExplicacao;
    }
    public String getElogio() {
        return elogio;
    }
    public String getDetalheInvestigacao() {
        return detalheinvestigacao;
    }
    public String getEncerramento() {
        return encerramento;
    }

}

