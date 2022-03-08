package day12.task5;

import java.util.List;

public class MusicBand {
    private String name; // название музыкальной группы
    private int year; // год основания
    private List<MusicArtist> members; // объект класса участников

    public MusicBand(String name, int year, List <MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for(MusicArtist musicArtist : a.getMembers()){
            b.getMembers().add(musicArtist);
        }
        a.getMembers().clear();
    }

    public void printMembers(){
        System.out.println(this.members);
    }
}
