package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        // Группа "Телепузики"
        // Создали список в который надо будет добавить объекты класса MusicArtist
        List<MusicArtist> musicArtists1 = new ArrayList<>();

        // Добавили объекты класса MusicArtist в список
        musicArtists1.add(new MusicArtist("Иван Иванов", 25));
        musicArtists1.add(new MusicArtist("Пётр Петров",33));
        musicArtists1.add(new MusicArtist("Сергей Сергеев", 31));

        // Создали объект класса MusicBand и передали в качестве списка участников заполненный список musicArtists1
        MusicBand musicBand1 = new MusicBand("Телепузики", 2024, musicArtists1);

        // Группа "Свинцовые поросята"
        // Создали список в который надо будет добавить объекты класса MusicArtist
        List<MusicArtist> musicArtists2 = new ArrayList<>();

        // Добавили объекты класса MusicArtist в список
        musicArtists2.add(new MusicArtist("Филипп Филиппов", 25));
        musicArtists2.add(new MusicArtist("Андрей Андреев", 27));
        musicArtists2.add(new MusicArtist("Виктор Викторов", 34));

        // Создали объект класса MusicBand и передали в качестве списка участников заполненный список musicArtists2
        MusicBand musicBand2 = new MusicBand("Свинцовые поросята", 2020, musicArtists2);

        // Выводим состав групп ДО слияния
        System.out.println("Состав ДО слияния:\n");
        MusicBand.printMusicArtists(musicBand1);
        MusicBand.printMusicArtists(musicBand2);

        // Делаем слияние групп
        MusicBand.transferMembers(musicBand1, musicBand2);

        // Выводим состав групп ПОСЛЕ слияния
        System.out.println("Состав ПОСЛЕ слияния:\n");
        MusicBand.printMusicArtists(musicBand1);
        MusicBand.printMusicArtists(musicBand2);

    }
}
