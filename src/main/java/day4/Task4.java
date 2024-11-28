package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();
        int maxSum = 0;
        int maxSumIdx = 0;

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        for (int i = 0; i < numbers.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += numbers[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }

        System.out.println(maxSum);
        System.out.println(maxSumIdx);


    }
}
