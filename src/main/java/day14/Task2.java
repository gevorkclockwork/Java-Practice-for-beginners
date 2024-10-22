package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));

    }

    public static List<String> parseFileToStringList(File file) {

        List<String> people = new ArrayList<>(); // Список, который будем возвращать если всё будет ок.

        try {
            Scanner scanner = new Scanner(file); // Считываем файл, в случае неудачи выбрасываем исключение FileNotFoundException Файл не найден
            while (scanner.hasNextLine()) { // Пока в файле есть строки
                String line = scanner.nextLine(); // Считываем каждую строку из файла в переменную line

                String[] person = line.split(" "); // Разделяем по пробелу считанную строку на отдельные элементы и добавляем в строковый массив
                if (Integer.parseInt(person[1]) < 0) {// Преобразовываем второй элемент массива к числу и проверяем является ли он отрицательным
                    throw new IllegalArgumentException(); // если да, то выбрасываем исключение IllegalArgumentException Некорректный входной файл
                }
                // Если второй элемент массива не является отрицательным, то добавляем строку в список.
                people.add(line);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл"); // Выводим оповещение
        }

        return null;
    }


}


