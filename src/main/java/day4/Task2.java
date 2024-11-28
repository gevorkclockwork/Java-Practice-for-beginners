package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countNumbersEnding0 = 0;
        int sumNumbersEnding0 = 0;

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            if (number % 10 == 0) {
                countNumbersEnding0++;
                sumNumbersEnding0 += number;
            }
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(countNumbersEnding0);
        System.out.println(sumNumbersEnding0);

    }
}
