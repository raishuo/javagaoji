package 散列表_HasH;
import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map {
    private final HashMap<Integer, String> coinages = new HashMap<>();

    public Hash_Map(){
        coinages.put(1, "penny");
        coinages.put(10, "dime");
        coinages.put(25, "quarter");
        coinages.put(50, "half-dollar");
    }

    public String comeBack(int money) {
        return coinages.getOrDefault(money, "NOT FOUND");
    }


    public static void main(String[] args) {
        Hash_Map coin = new Hash_Map();
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        System.out.println(coin.comeBack(amount));

    }
}
