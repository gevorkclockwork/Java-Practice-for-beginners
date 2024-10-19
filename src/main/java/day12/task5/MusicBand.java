package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtist> musicArtists; // список участников группы

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // Доработано ДОБАВЛЕНИЕ участников группы списком: третий аргумент метода
    public MusicBand(String name, int year, List<MusicArtist> musicArtists) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtists;
    }

    public List<MusicArtist> getMembers() {
        return musicArtists;
    }

    // Доработано УДАЛЕНИЕ участников группы списком.
    // Метод вызывается у объекта MusicBand из состава участников которого, удаляется переданный список участников.
    public List<MusicArtist> deleteMembers(List<MusicArtist> musicArtist) {
        for (MusicArtist member : musicArtist) {
            this.musicArtists.remove(member);
        }
        return musicArtists;
    }

    public static List<MusicArtist> transferMembers(MusicBand bandA, MusicBand bandB) {
        bandB.getMembers().addAll(bandA.getMembers());
        bandA.getMembers().removeAll(bandA.getMembers());
        return bandB.getMembers();
    }

    public static void printMusicArtists(MusicBand band) {
        System.out.println("Группа \"" + band.getName() + "\":");
        for (MusicArtist musicArtist : band.getMembers()) {
            System.out.println(musicArtist.getName() + " " + musicArtist.getAge() + " лет.");
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
