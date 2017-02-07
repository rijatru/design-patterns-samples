package com.company.structural.composite;

public class SongListGenerator {

    public static void main(String[] args){

        SongComponent industrialMusic = new SongGroup("Industrial", "Industrial desctiption");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "Heavy description");
        SongComponent dubstepMusic = new SongGroup("Dubstep", "Dubstep description");


        SongGroup everySong = new SongGroup("Song List", "Every Song Available");

        everySong.add(industrialMusic);

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.add(dubstepMusic);

        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1070));
        heavyMetalMusic.add(new Song("Ace Of Spades", "Motorhead", 2011));

        DiscJockey crazyLarry = new DiscJockey(everySong);

        crazyLarry.getSongList();
    }
}
