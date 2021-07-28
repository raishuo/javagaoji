package 容器;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<>();
        a.add("asd");
        a.add("asda");
        for (String k : a) {
            System.out.println(k);
        }
        System.out.println(a);
    }
}
