package com.company.behavioral.command.commands;

import com.company.behavioral.command.interfaces.Command;
import com.company.behavioral.command.interfaces.ElectronicDevice;

public class TurnTvVolumeUp implements Command {

    private ElectronicDevice theDevice;

    public TurnTvVolumeUp(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }
}
