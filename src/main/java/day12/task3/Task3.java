package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Task3 {

    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Группа1", 1965);
        MusicBand band2 = new MusicBand("Группа2", 2017);
        MusicBand band3 = new MusicBand("Группа3", 2022);
        MusicBand band4 = new MusicBand("Группа4", 1977);
        MusicBand band5 = new MusicBand("Группа5", 2014);
        MusicBand band6 = new MusicBand("Группа6", 1950);
        MusicBand band7 = new MusicBand("Группа7", 2013);
        MusicBand band8 = new MusicBand("Группа8", 2012);
        MusicBand band9 = new MusicBand("Группа9", 1995);
        MusicBand band10 = new MusicBand("Группа10", 2004);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);
        Collections.shuffle(musicBands);// перемешиваем список
        System.out.println(musicBands);

        List<MusicBand> musicBandAfter2000 = new ArrayList<>();
        for (MusicBand band : musicBands){
            if(band.getYear() > 2000){
                musicBandAfter2000.add(band);
            }
        }
        System.out.println(musicBandAfter2000);
    }
}

