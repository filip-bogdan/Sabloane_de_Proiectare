public class Main {
    public static void main(String[] args) {
        MediaPlayer m = new MediaPlayer("Winamp");
        Playlist p = new Playlist("Chill");

        p.add(new Melodie("BudaBar",3000));
        p.add(new Videoclip("Waves in Caraibe",20000));
        p.add(new Melodie("Simple things",4000));
        p.add(new Gif("sunglasses",500));

        m.add(p);

        MediaPlayerStatistics v = new MediaPlayerStatistics();
        m.accept(v);
        v.print();
    }
}
