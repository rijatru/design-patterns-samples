package com.company.behavioral.Iterator;

import java.util.Iterator;

public class DiscJockey {

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

    public DiscJockey(SongIterator iter70sSongs, SongIterator iter80sSongs, SongIterator iter90sSongs) {

        this.iter70sSongs = iter70sSongs;
        this.iter80sSongs = iter80sSongs;
        this.iter90sSongs = iter90sSongs;
    }

    public void showTheSongs() {

        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");

        printTheSongs(songs70s);

        System.out.println("Songs of the 80s\n");

        printTheSongs(songs80s);

        System.out.println("Songs of the 90s\n");

        printTheSongs(songs90s);
    }

    private void printTheSongs(Iterator iterator) {

        while (iterator.hasNext()) {

            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.print(songInfo.getSongName() + ", ");
            System.out.print(songInfo.getBandName() + ", ");
            System.out.print(songInfo.getYearReleased());
            System.out.println();
        }

        System.out.println();
    }
}
