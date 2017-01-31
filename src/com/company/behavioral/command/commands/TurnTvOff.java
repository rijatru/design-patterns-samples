package com.company.behavioral.command.commands;

import com.company.behavioral.command.interfaces.Command;
import com.company.behavioral.command.interfaces.ElectronicDevice;

public class TurnTvOff implements Command {

    private ElectronicDevice theDevice;

    public TurnTvOff(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
