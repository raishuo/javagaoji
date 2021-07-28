package 类.继承;

import java.util.ArrayList;

public class Database {
    private final ArrayList<Item> listItem = new ArrayList<>();

    public void add(Item item) {
        listItem.add(item);
    }

    public void list() {
        for (Item item : listItem) {
            item.print();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("ad", "ad", false, 60, "123"));
        db.add(new DVD("wen", "asd", false, 4, "1"));
        db.list();
    }
}
