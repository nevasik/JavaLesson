package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
        string.add("bmv");
        string.add("lexus");
        string.add("kia");
        string.add("mercedes");
        string.add("lada");

        System.out.println(string);

        string.add(2, "honda");
        string.remove(0);
        System.out.println(string);
    }
}
