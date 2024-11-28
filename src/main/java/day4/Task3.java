package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random rand = new Random();

        int m = 12;
        int n = 8;

        int[][] numbers = new int[m][n];

        int maxSum = 0;
        int maxSumIdx = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rand.nextInt(50);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }

        System.out.println(maxSumIdx);

    }
}
