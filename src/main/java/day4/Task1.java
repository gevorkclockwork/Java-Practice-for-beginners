package day4;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(11);
        }

        int numbersGreaterThan8 = 0;
        int numbersEqualTo1 = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;

        for (int number : numbers) {
            if (number > 8) {
                numbersGreaterThan8++;
            }
            if (number == 1) {
                numbersEqualTo1++;
            }
            if (number % 2 == 0) {
                evenNumbers++;
            }
            if (number % 2 != 0) {
                oddNumbers++;
            }
            sum += number;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + numbersGreaterThan8);
        System.out.println("Количество чисел равных 1: " + numbersEqualTo1);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}

