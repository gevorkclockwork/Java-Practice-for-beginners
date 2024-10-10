package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        int m = 3;
        int n = 5;
        int[][] numbers = new int[m][n];

        // Заполняем массив
        for (int i = 0; i < numbers.length; i++) { // Сначала проходимся по строкам во внешнем цикле
            for (int j = 0; j < numbers[i].length; j++) { // Затем проходимся по столбцам во вложенном цикле
                numbers[i][j] = random.nextInt(50); // Присваиваем случайное число каждому элементу массива
            }
        }

//        // Вывод значений элементов массива
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }

        // ИНФОРМАЦИЯ ИЗ РЕШЕНИЯ ПРЕПОДАВАТЕЛЯ:

        int maxSum = 0;
        int maxSumIdx = 0;
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

        System.out.println("Индекс строки, сумма чисел в которой максимальна равен: " + maxSumIdx);
    }
}
