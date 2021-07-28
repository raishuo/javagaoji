package 时钟代码;

public class Clock {
    private final Display hour = new Display(24);
    private final Display minute = new Display(60);
    private final Display second = new Display(60);

    @SuppressWarnings("InfiniteLoopStatement")
    public void start() {
        while (true) {
            second.increase();
            if (second.getValue() == 0) {
                minute.increase();
                if (minute.getValue() == 0){
                    hour.increase();
                }
            }
            System.out.printf("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(), second.getValue());
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
    }
}
