package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        // Группа 1
        List<String> members1 = new ArrayList<>();
        members1.add("Ivan Ivanov");
        members1.add("Sergey Petrov");
        members1.add("Alexey Kireev");

        MusicBand metallica = new MusicBand("Telepuziki", 2002, members1);

        // Группа 2
        List<String> members2 = new ArrayList<>();
        members2.add("Tom Hanks");
        members2.add("Bob Marley");
        members2.add("Sam Warrington");

        MusicBand panzer = new MusicBand("Gnomiki", 2015, members2);


        metallica.printMembers();
        panzer.printMembers();

        MusicBand.transferMembers(metallica, panzer);

        metallica.printMembers();
        panzer.printMembers();

    }
}
