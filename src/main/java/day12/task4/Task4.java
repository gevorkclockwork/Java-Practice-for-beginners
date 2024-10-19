package day12.task4;

import java.util.ArrayList;
import java.util.List;

import static day12.task4.MusicBand.printMembers;
import static day12.task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {

        // Группа "Телепузики"
        // Создали список в который надо будет добавить объекты класса String
        List<String> members1 = new ArrayList<String>();

        // Добавили объекты класса String в список
        members1.add("Иван Иванов");
        members1.add("Пётр Петров");
        members1.add("Сергей Сергеев");

        // Создали объект класса MusicBand и передали в качестве списка участников заполненный список members1
        MusicBand musicBand1 = new MusicBand("Телепузики", 2024, members1);

        // Создали список в который надо будет добавить объекты класса String
        List<String> members2 = new ArrayList<>();

        // Добавили объекты класса String в список
        members2.add("Филипп Филиппов");
        members2.add("Андрей Андреев");
        members2.add("Виктор Викторов");

        // Создали объект класса MusicBand и передали в качестве списка участников заполненный список members2
        MusicBand musicBand2 = new MusicBand("Свинцовые поросята", 2020, members2);

        // Выводим состав групп ДО слияния
        System.out.println("Состав ДО слияния:\n");
        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);

        // Делаем слияние групп
        MusicBand.transferMembers(musicBand1, musicBand2);

        // Выводим состав групп ПОСЛЕ слияния
        System.out.println("Состав ПОСЛЕ слияния:\n");
        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);

    }
}
