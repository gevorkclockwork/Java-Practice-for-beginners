package day12.task4;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        musicBand2.members.addAll(musicBand1.getMembers());
        musicBand1.members.removeAll(musicBand1.getMembers());
    }

    public void printMembers() {
        System.out.println(members);
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}
