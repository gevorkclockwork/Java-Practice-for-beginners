package day12.task4;

import java.util.ArrayList;
import java.util.List;

import static day12.task4.MusicBand.printMembers;
import static day12.task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {

        /*
        4.  *Выполнять в подпапке task4 в day12*
            Скопировать MusicBand из прошлого задания и доработать таким образом,
            чтобы в группу можно было добавлять и удалять участников списком (по несколько
            участников за раз, а не по одному). Под участником понимается строка (String) с
            именем и фамилией. Реализовать статический метод слияния групп (в классе MusicBand),
            т.е. все участники группы А переходят в группу B. Название метода: transferMembers.
            Этот метод принимает в качестве аргументов два экземпляра класса MusicBand. В классе MusicBand,
            реализовать метод printMembers(), печатающий список участников в консоль и метод getMembers(),
            возвращающий список участников.
            Проверить состав групп после слияния.

         */

        // Группа "Телепузики"
        // Создали объекты класса String
        String member1 = "Иван Иванов";
        String member2 = "Пётр Петров";
        String member3 = "Сергей Сергеев";

        // Создали список в который надо будет добавить объекты класса String
        List<String> members1 = new ArrayList<String>();

        // Добавили объекты класса String в список
        members1.add(member1);
        members1.add(member2);
        members1.add(member3);

        // Создали объект класса MusicBand и передали в качестве списка участников заполненный список members1
        MusicBand musicBand1 = new MusicBand("Телепузики", 2024, members1);

        // Группа "Свинцовые поросята"
        // Создали объекты класса String
        String member4 = "Филипп Филиппов";
        String member5 = "Андрей Андреев";
        String member6 = "Виктор Викторов";

        // Создали список в который надо будет добавить объекты класса String
        List<String> members2 = new ArrayList<>();

        // Добавили объекты класса String в список
        members2.add(member4);
        members2.add(member5);
        members2.add(member6);

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
