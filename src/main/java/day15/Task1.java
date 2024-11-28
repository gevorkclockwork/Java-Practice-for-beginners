package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.SortedMap;

public class Task1 {
    public static void main(String[] args) {

        File fileIn = new File("src/main/resources/shoes.csv");
        File fileOut = new File("src/main/resources/missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(fileIn);
            if (fileIn.length() == 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Входной файл пустой!");
                }
            } else {
                PrintWriter pw = new PrintWriter(fileOut);
                while (scanner.hasNextLine()) {
                    String[] shoesData = scanner.nextLine().split(";");
                    if (shoesData.length != 3) {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Некорректный входной файл!");
                            return;
                        }
                    } else {
                        if (Integer.parseInt(shoesData[2]) == 0) {
                            pw.println(shoesData[0] + ", " + shoesData[1] + ", " + shoesData[2]);
                        }
                    }
                }
                pw.close();
                scanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Входной файл не найден!");
        }


        // Работающий вариант
//        try {
//            Scanner scanner = new Scanner(fileIn);
//            PrintWriter pw = new PrintWriter(fileOut);
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] shoesData = line.split(";");
//                if (Integer.parseInt(shoesData[2]) == 0) {
//                    pw.println(shoesData[0] + ", " + shoesData[1] + ", " + shoesData[2]);
//                }
//            }
//            pw.close();
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл для не найден");
//        }


    }
}
