package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("test.txt");
        printResult(file);


    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            String[] numbers = scanner.nextLine().split(" ");
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            double result = (double) sum / numbers.length;
            System.out.printf(result + " --> %.3f", result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

}

