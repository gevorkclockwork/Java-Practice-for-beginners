package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));

    }


    public static List<Person> parseFileToObjList(File file) {
        List<Person> personList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] persons = line.split(" ");

                if (Integer.parseInt(persons[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                Person currenPerson = new Person(persons[0], Integer.parseInt(persons[1]));
                personList.add(currenPerson);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return personList;

    }
}
