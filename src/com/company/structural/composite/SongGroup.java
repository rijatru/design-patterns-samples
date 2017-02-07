package com.company.structural.composite;

import java.util.ArrayList;

public class SongGroup extends SongComponent {

    private ArrayList<SongComponent> songComponents = new ArrayList<>();

    private String groupName;
    private String groupDescription;

    public SongGroup(String groupName, String groupDescription) {

        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent songComponent) {
        songComponents.add(songComponent);
    }

    public void remove(SongComponent songComponent) {
        songComponents.remove(songComponent);
    }

    public SongComponent getComponent(int componentIndex) {

        return songComponents.get(componentIndex);
    }

    public void displaySongInfo() {

        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");

        for (SongComponent songComponent : songComponents) {

            songComponent.displaySongInfo();
        }
    }
}
