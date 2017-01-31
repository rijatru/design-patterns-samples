package com.company.behavioral.command.invokers;

import com.company.behavioral.command.interfaces.Command;

public class DeviceButton {

    private Command theCommand;

    public DeviceButton(Command theCommand) {
        this.theCommand = theCommand;
    }

    public void press() {
        theCommand.execute();
    }

    public void pressUndo() {
        theCommand.undo();
    }
}
