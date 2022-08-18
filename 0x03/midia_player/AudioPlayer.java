public class AudioPlayer implements MediaPlayer {

    private MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(TipoMedia.MP4);

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {

        if(tipoMedia == TipoMedia.MP3) {
            System.out.printf("Reproduzindo MP3: %s", nome);
        }

        if(tipoMedia != TipoMedia.MP3) {
            mediaPlayerAdapter.reproduzir(tipoMedia, nome);
        }

    }
}
