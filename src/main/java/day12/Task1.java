package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>(Arrays.asList("Audi", "BMW", "Mercedes-Benz", "Toyota", "Honda"));
        System.out.println(arrayList);

        arrayList.add(2, "Tesla");
        System.out.println(arrayList);

        arrayList.remove(arrayList.get(0));
        System.out.println(arrayList);
    }
}
