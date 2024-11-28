package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();
        fill(0, 30, numbersList);
        fill(300, 350, numbersList);
        System.out.println(numbersList);

    }

    public static void fill(int startNumber, int endNumber, List<Integer> list) {
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
    }


}
