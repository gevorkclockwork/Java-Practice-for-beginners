package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        // Группа 1
        List<MusicArtist> musicArtists1 = new ArrayList<>();
        musicArtists1.add(new MusicArtist("Иван Иванов", 18));
        musicArtists1.add(new MusicArtist("Сергей Петров", 23));
        musicArtists1.add(new MusicArtist("Андрей Киреев", 19));

        MusicBand metallica = new MusicBand("Metallica", 1998, musicArtists1);

        // Группа 2
        List<MusicArtist> musicArtists2 = new ArrayList<>();
        musicArtists2.add(new MusicArtist("John Petrov", 25));
        musicArtists2.add(new MusicArtist("Bob Marley", 17));
        musicArtists2.add(new MusicArtist("Kurt Cobain", 21));

        MusicBand panzer = new MusicBand("Panzer", 2005, musicArtists2);

        metallica.printMembers();
        panzer.printMembers();

        MusicBand.transferMembers(metallica, panzer);

        metallica.printMembers();
        panzer.printMembers();
    }

}
