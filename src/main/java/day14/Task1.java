package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("test.txt");
        printSumDigits(file);
    }


    public static void printSumDigits(File file) {

        // Пояснение по try - catch:
        // Мы пытаемся выполнить часть кода в блоке try и надеемся, что исключение не будет выброшено, но
        // если оно выброшено, то мы его обрабатываем в блоке catch
        try {
            Scanner scanner = new Scanner(file); // В блоке try находится весь код, который может вызвать исключение.

            String line = scanner.nextLine(); // Считываем в строку данных из файла
            String[] numbersString = line.split(" "); // Разделяем строку в массив строк

            if (numbersString.length != 10) // Проверяем если длина массива не равна 10, то выбрасываем исключение
                throw new IllegalArgumentException();

            int sum = 0; // В переменной будем считать сумму элементов массива
            for (String numberString : numbersString) { // Запускаем цикл по элементам строкового массива
                sum += Integer.parseInt(numberString); // К переменной sum прибавляем значение тек. элемента
            }                                          // строкового массива, преобразованного к числу.
            System.out.println(sum); // Выводим сумму элементов

        } catch (FileNotFoundException e) { // Объект FileNotFoundException, который выбрасывается в результате выполнения некорректного кода выше
            System.out.println("Файл не найден"); // А обработка исключения находится в блоке catch (у объекта вызывается метод printStackTrace()).
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл"); // Выводим оповещение
        }

    }


}
