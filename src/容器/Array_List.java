package 容器;

import java.util.ArrayList;

public class Array_List {
    ArrayList<String> notes = new ArrayList<>();

    public void add(String s) {
        notes.add(s);
    }

    public void add(String s, int a) {
        notes.add(a, s);    // 向容器notes位置a插入字符串s
    }

    public int getSize() {
        return notes.size();    // 返回容器中有多少个数据
    }

    public String getNote(int index) {
        return notes.get(index);    // 返回位置index上的值
    }

    public void removeNote(int index) {
        notes.remove(index);    // 删除容器位置index上的数
    }

    public String[] list() {
        String[] a = new String[notes.size()];
        notes.toArray(a);   // 将ArrayList复制到字符型a中
        return a;
    }


    public static void main(String[] args) {
        Array_List nb = new Array_List();
        nb.add("a");
        nb.add("b");
        nb.add("c", 1);
        String[] a = nb.list();
        System.out.println(nb.getSize());


    }
}
