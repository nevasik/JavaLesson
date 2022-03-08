package day12;


import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> abc = new ArrayList<>();
        abc.add(numbers());

    }

    public static int numbers() {
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int b = 300; b < 351; b++) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }
        return 0;
    }
}
