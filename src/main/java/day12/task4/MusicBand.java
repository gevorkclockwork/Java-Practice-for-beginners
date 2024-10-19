package day12.task4;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> members; // список участников группы

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // Доработано ДОБАВЛЕНИЕ участников группы списком: третий аргумент метода
    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    // Доработано УДАЛЕНИЕ участников группы списком.
    // Метод вызывается у объекта MusicBand из состава участников которого, удаляется переданный список участников.
    public List<String> deleteMembers(List<String> members) {
        for (String member : members) {
            this.members.remove(member);
        }
        return members;
    }

    public static List<String> transferMembers(MusicBand bandA, MusicBand bandB) {
        bandB.getMembers().addAll(bandA.getMembers());
        bandA.getMembers().removeAll(bandA.getMembers());
        return bandB.getMembers();
    }

    public static void printMembers(MusicBand band) {
        System.out.println("Группа \"" + band.getName() + "\":");
        for (String member : band.getMembers()) {
            System.out.println(member);
        }
        System.out.println();
    }


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
