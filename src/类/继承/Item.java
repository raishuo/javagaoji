package 类.继承;

public class Item {
    private final String comment;
    private final String title;
    private final boolean gotIt;
    private final int playingTime;

    public Item(String comment, String title, boolean gotIt, int playingTime) {
        this.comment = comment;
        this.title = title;
        this.gotIt = gotIt;
        this.playingTime = playingTime;
    }

    public void print() {
        System.out.println("  comment:" + comment + "  title:" + title+"  gotIt:" + gotIt +"  playingTime:"+playingTime);
    }
}
