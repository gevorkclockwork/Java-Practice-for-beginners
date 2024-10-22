package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        // Создать 10 или более экземпляров класса MusicBand
        MusicBand metallica = new MusicBand("Metallica", 1984);
        MusicBand acdc = new MusicBand("ACDC", 1970);
        MusicBand korn = new MusicBand("KORN", 2001);
        MusicBand ironMaiden = new MusicBand("Iron Maiden", 1980);
        MusicBand blackSabbath = new MusicBand("Black Sabbath", 1984);
        MusicBand rammstein = new MusicBand("Rammstein", 2002);
        MusicBand greenDay = new MusicBand("Green Day", 2004);
        MusicBand slipknot = new MusicBand("Slipknot", 1997);
        MusicBand kiss = new MusicBand("KISS", 1981);
        MusicBand scorpions = new MusicBand("Scorpions", 1979);

        // добавить их в список
        List<MusicBand> bands = new ArrayList<>();
        bands.add(metallica);
        bands.add(acdc);
        bands.add(korn);
        bands.add(ironMaiden);
        bands.add(blackSabbath);
        bands.add(rammstein);
        bands.add(greenDay);
        bands.add(slipknot);
        bands.add(kiss);
        bands.add(scorpions);

        // Перемешать список.
        Collections.shuffle(bands);

        // Выводим исходный, но уже перемешанный список
        System.out.println("Исходный, но уже перемешанный список:");
        for (MusicBand band : bands) {
            System.out.println(band.getName() + " " + band.getYear());
        }
        System.out.println();

        // Выводим группы, основанные после 2000
        System.out.println("Группы, основанные после 2000:");
        for (MusicBand band : groupsAfter2000(bands)) {
            System.out.println(band.getName() + " " + band.getYear());
        }

    }


    // Этот метод принимает список групп в качестве аргумента и возвращает новый список,
    // состоящий из групп, основанных после 2000 года.
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }


}
