import br.com.alura.mediaplayer.dispositivosdemedia.Media;

public class Principal {
    public static void main(String[] args) {

        Media media = new Media();
        media.setNome("Breaking the habbit");
        media.setEstilo("musica");
        media.setTempoDeDuracao(3.55);
        media.setCurtidas(1500);
        media.setReproduzir(true);

        media.fichaTecnica();
        media.play();

    }
}
