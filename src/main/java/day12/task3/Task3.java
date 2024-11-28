package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand musicBand0 = new MusicBand("Metla", 2010);
        MusicBand musicBand1 = new MusicBand("Topor", 1999);
        MusicBand musicBand2 = new MusicBand("Sovok", 2008);
        MusicBand musicBand3 = new MusicBand("Pasta", 1980);
        MusicBand musicBand4 = new MusicBand("Sachs", 2003);
        MusicBand musicBand5 = new MusicBand("Poker", 1978);
        MusicBand musicBand6 = new MusicBand("Tiger", 2013);
        MusicBand musicBand7 = new MusicBand("Zebra", 2001);
        MusicBand musicBand8 = new MusicBand("Storm", 1997);
        MusicBand musicBand9 = new MusicBand("Peklo", 1995);


        List<MusicBand> musicBands = new ArrayList<>(Arrays.asList(musicBand0, musicBand1, musicBand2, musicBand3, musicBand4,
                                                                   musicBand5, musicBand6, musicBand7, musicBand8, musicBand9));

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        List<MusicBand> bandsAfter2000 = groupsAfter2000(musicBands);

        System.out.println(musicBands);
        System.out.println(bandsAfter2000);

    }

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
