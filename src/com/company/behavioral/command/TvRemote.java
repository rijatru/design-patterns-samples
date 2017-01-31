package com.company.behavioral.command;

import com.company.behavioral.command.interfaces.ElectronicDevice;

public class TvRemote {

    public static ElectronicDevice getDevice() {

        return new Television();
    }
}
