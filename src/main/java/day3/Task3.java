package day3;

import java.util.Scanner;
import java.util.SortedMap;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double divisible;
        double divider;
        double quotient;

        for (int i = 0; i < 5; i++) {
            divisible = scanner.nextDouble();
            divider = scanner.nextDouble();

            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            quotient = divisible / divider;
            System.out.println(quotient);
        }


    }
}
