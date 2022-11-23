public class MediaPlayerStatistics implements Visitor{

    int dimV, dimG, dimM ;

    public MediaPlayerStatistics() {
        dimV = 0;
        dimG = 0;
        dimM = 0;
    }

    @Override
    public void visitMP(MediaPlayer _MediaPlayer) {
        System.out.println("\nNume MediaPlayer: " + _MediaPlayer.getNume());
    }

    @Override
    public void visitP(Playlist _Playlist) {
        System.out.println("\nNume Playlist: " + _Playlist.getNume());
    }

    @Override
    public void visitVideoclip(Videoclip _VideoClip) {
        dimV += _VideoClip.getDim();
    }

    @Override
    public void visitGif(Gif _Gif) {
        dimG += _Gif.getDim();
    }

    @Override
    public void visitMelodie(Melodie _Melodie) {
        dimM += _Melodie.getDim();
    }

    public void print(){
        if(dimM > 0)
            System.out.println("  Dimensiune Melodie: " + dimM + " Kb");

        if(dimG > 0)
            System.out.println("  Dimensiune Gif: " + dimG + " Kb");

        if(dimV > 0)
            System.out.println("  Dimensiune Melodie: " + dimV + " Kb");
        int dimTotala =  dimM + dimG + dimV;
        System.out.println("  Dimensiune Totala: " + dimTotala + " Kb");
    }
}
