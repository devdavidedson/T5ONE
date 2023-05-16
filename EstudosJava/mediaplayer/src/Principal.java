import br.com.alura.mediaplayer.dispositivosdemedia.Media;

public class Principal {
    public static void main(String[] args) {

        Media media = new Media();
        media.setNome("Breaking the habbit");
        media.setEstilo("Rock");
        media.setTempoDeDuracao(3.55);
        media.setCurtidas(1500);
        media.setReproduzir(true);

        System.out.println("Música: " + media.getNome());
        System.out.println("Estilo: " + media.getEstilo());
        System.out.println("Duração: " + media.getTempoDeDuracao() + " min.");
        media.play();
        System.out.println("a Música tem " + media.getCurtidas() + " curtidas");
    }
}
