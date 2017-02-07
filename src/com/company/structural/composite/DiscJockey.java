package com.company.structural.composite;

public class DiscJockey {

    private SongComponent songList;

    public DiscJockey(SongComponent songList) {
        this.songList = songList;
    }

    public void getSongList() {

        songList.displaySongInfo();
    }
}
