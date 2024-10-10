package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создали экземпляр класса сканнер
        Random random = new Random(); // Создали экземпляр класса рандом
        int arrayLength = scanner.nextInt(); // Получаем число с консоли от пользователя и сохраняем в переменную
        int[] numbers = new int[arrayLength]; // Создаем одномерный массив и в качестве размера передаем значение из n

        for (int i = 0; i < numbers.length; i++) { // Запускаем цикл от первого до последнего элемента массива
            numbers[i] = random.nextInt(11); // В качестве значения элемента массива по его индексу вставляем случайной число
        }

        int moreThanEight = 0;
        int equalsOne = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;

        for (int num : numbers) {
            System.out.print(num + " ");
            if (num > 8) {
                moreThanEight++;
            }
            if (num == 1) {
                equalsOne++;
            }
            if (num % 2 == 0) {
                evenNumbers++;
            }
            if (num % 2 != 0) {
                oddNumbers++;
            }
            sum += num;
        }
        System.out.println();
        System.out.println("Длина массива: " + arrayLength);
        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива: " + sum);

        // ИНФОРМАЦИЯ ИЗ РЕШЕНИЯ ПРЕПОДАВАТЕЛЯ:

        // Метод Arrays.toString - возвращает строковое представления массива:
        System.out.println(Arrays.toString(numbers));  // [1, 2, 3, 4, 5]


    }
}
