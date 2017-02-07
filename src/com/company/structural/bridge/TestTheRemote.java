package com.company.structural.bridge;

public class TestTheRemote {

    public static void main(String[] args) {

        RemoteButton theTv = new TVRemoteMute(new TVDevice(1, 200));

        RemoteButton theTv2 = new TVRemotePause(new TVDevice(1, 200));

        RemoteButton theDVD = new DVDRemote(new DVDDevice(1, 14));

        System.out.println("Test TV with Mute");

        theTv.buttonFivePressed();
        theTv.buttonSixPressed();
        theTv.buttonNinePressed();

        System.out.println("\nTest TV with Pause");

        theTv2.buttonFivePressed();
        theTv2.buttonSixPressed();
        theTv2.buttonSixPressed();
        theTv2.buttonSixPressed();
        theTv2.buttonSixPressed();
        theTv2.buttonNinePressed();
        theTv2.deviceFeedBack();
    }
}
