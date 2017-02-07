package com.company.structural.bridge;

public class DVDRemote extends RemoteButton {

    public DVDRemote(EntertainmentDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void buttonNinePressed() {

        System.out.println("DVD was Paused");
    }
}
