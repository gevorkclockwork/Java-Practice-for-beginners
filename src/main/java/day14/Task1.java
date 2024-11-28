package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("test.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] stringNumbers = line.split(" ");

            if (stringNumbers.length != 10) {
                throw new IllegalArgumentException();
            }
            int sum = 0;
            for (String stringNumber : stringNumbers) {
                sum += Integer.parseInt(stringNumber);
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
