package com.company.structural.bridge;

public abstract class EntertainmentDevice {

    public int deviceState;

    public int maxSetting;

    public int volumeLevel;

    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();

    public void deviceFeedBack() {

        if (deviceState > maxSetting || deviceState < 0) {

            deviceState = 0;
        }

        System.out.println("On " + deviceState);
    }

    public void buttonSevenPRessed() {

        volumeLevel++;

        System.out.println("Volume at: " + volumeLevel);
    }

    public void buttonEightPRessed() {

        volumeLevel++;

        System.out.println("Volume at: " + volumeLevel);
    }
}
