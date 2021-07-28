package 时钟代码;

public class Display {
    private int value;
    private final int limit;

    public Display(int limit) {
        this.limit = limit;
    }

    public void increase() {
        value++;
        if (value == limit) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }
}