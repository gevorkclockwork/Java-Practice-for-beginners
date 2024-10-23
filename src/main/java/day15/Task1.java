package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("src/main/resources/shoes.csv");
        File fileOut = new File("missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(fileOut);
            while (scanner.hasNextLine()) {
                String[] array = scanner.nextLine().split(";");
                if (Integer.parseInt(array[2]) == 0) {
                    pw.println(array[0] + ", " + array[1] + ", " + array[2]);
                }
            }
            pw.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}
