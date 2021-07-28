package 类.继承;

public class DVD extends Item {
    private final String director;

    public DVD(String comment, String title, boolean gotIt, int playingTime, String director) {
        super(comment, title, gotIt, playingTime);
        this.director = director;
    }

    public void print() {
        System.out.print("director:" + director);
        super.print();
    }
}
