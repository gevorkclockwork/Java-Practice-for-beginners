package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        Task2.fillTheList(0, 30, arrayList);
        Task2.fillTheList(300, 350, arrayList);
        System.out.println(arrayList);

    }

    public static void fillTheList(int lowerBound, int upperBound, List<Integer> list) {
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
    }


}
