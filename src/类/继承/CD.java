package 类.继承;

public class CD extends Item {
    private final String artist;

    public CD(String comment, String title, boolean gotIt, int playingTime, String artist) {
        super(comment, title, gotIt, playingTime);
        this.artist = artist;
    }


    public void print() {
        System.out.print("artist：" + artist);
        super.print();
    }
}
