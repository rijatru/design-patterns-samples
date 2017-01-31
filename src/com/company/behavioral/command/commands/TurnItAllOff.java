package com.company.behavioral.command.commands;

import com.company.behavioral.command.interfaces.Command;
import com.company.behavioral.command.interfaces.ElectronicDevice;

import java.util.List;

public class TurnItAllOff implements Command {

    private List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> theDevices) {
        this.theDevices = theDevices;
    }

    @Override
    public void execute() {

        for (ElectronicDevice device : theDevices) {

            device.off();
        }
    }

    @Override
    public void undo() {

        for (ElectronicDevice device : theDevices) {

            device.on();
        }
    }
}
