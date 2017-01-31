package com.company.behavioral.command.commands;

import com.company.behavioral.command.interfaces.Command;
import com.company.behavioral.command.interfaces.ElectronicDevice;

public class TurnTvOn implements Command {

    private ElectronicDevice theDevice;

    public TurnTvOn(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
