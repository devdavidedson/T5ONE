package br.com.alura.mediaplayer.dispositivosdemedia;

public class Media {
    private String nome;
    private String estilo;
    private double tempoDeDuracao;
    private int curtidas;
    private boolean reproduzir;

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEstilo() {return estilo;}
    public String setEstilo(String estilo) {return this.estilo = estilo;}
    public double getTempoDeDuracao() {return tempoDeDuracao;}
    public void setTempoDeDuracao(double tempoDeDuracao) {this.tempoDeDuracao = tempoDeDuracao;}
    public int getCurtidas() {return curtidas;}
    public void setCurtidas(int curtidas) {this.curtidas = curtidas;}
    public void setReproduzir(boolean reproduzir) {this.reproduzir = reproduzir;}

    public void play() {
        if (reproduzir) {
            System.out.println("Iniciando: " + nome);
        } else {
            System.out.println("O Player não está tocando");
        }
    }

    public void fichaTecnica() {
        System.out.println("Música: " + getNome());
        System.out.println("Estilo: " + getEstilo());
        System.out.println("Duração: " + getTempoDeDuracao() + " min.");
        System.out.println("a Música tem " + getCurtidas() + " curtidas");
    }
}
