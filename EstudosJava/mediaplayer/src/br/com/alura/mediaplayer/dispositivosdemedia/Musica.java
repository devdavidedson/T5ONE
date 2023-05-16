package br.com.alura.mediaplayer.dispositivosdemedia;

public class Musica extends Media{
    private String album;
    private int musicasPorAlbum;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getMusicasPorAlbum() {
        return musicasPorAlbum;
    }

    public void setMusicasPorAlbum(int musicasPorAlbum) {
        this.musicasPorAlbum = musicasPorAlbum;
    }
}
