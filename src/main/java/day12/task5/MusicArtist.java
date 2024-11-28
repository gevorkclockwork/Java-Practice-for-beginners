package day12.task5;

import day12.task4.MusicBand;

public class MusicArtist {

    private String name;
    private int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
