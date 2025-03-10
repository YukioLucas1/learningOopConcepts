import Modelos.Musica;
import Modelos.Podcast;
import Modelos.Preferidos;

public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Musica1");
        musica.setAlbum("Album1");
        musica.setCantor("Cantor1");
        musica.setGenero("pop");


        for(int i = 0; i <= 2000; i++) {
            musica.reproduz();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("genericocast");
        podcast.setApresentador("apresentador1");
        podcast.setDescricao("seu programa de assuntos genericos semanal");

        for(int u = 0; u > 500; u++) {
            podcast.curte();
        }

        Preferidos preferida = new Preferidos();
        preferida.inclui(musica);
        preferida.inclui(podcast);
    }
}