package com.company.structural.bridge;

public class DVDDevice extends EntertainmentDevice {

    public DVDDevice(int newDeviceState, int newMaxChapter) {

        deviceState = newDeviceState;
        maxSetting = newMaxChapter;
    }

    @Override
    public void buttonFivePressed() {

        System.out.println("Chapter Down");

        deviceState--;
    }

    @Override
    public void buttonSixPressed() {

        System.out.println("Chapter Up");

        deviceState++;
    }
}
