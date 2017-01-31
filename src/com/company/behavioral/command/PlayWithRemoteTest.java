package com.company.behavioral.command;

import com.company.behavioral.command.commands.TurnItAllOff;
import com.company.behavioral.command.commands.TurnTvOff;
import com.company.behavioral.command.commands.TurnTvOn;
import com.company.behavioral.command.commands.TurnTvVolumeUp;
import com.company.behavioral.command.interfaces.Command;
import com.company.behavioral.command.interfaces.ElectronicDevice;
import com.company.behavioral.command.invokers.DeviceButton;

import java.util.*;

public class PlayWithRemoteTest {

    public static void main(String[] args) {

        LinkedList<DeviceButton> buttonsList = new LinkedList<>();

        ElectronicDevice newDevice = TvRemote.getDevice();

        Command onCommand = new TurnTvOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        buttonsList.addFirst(onPressed);

        // ------------------------

        Command oFFCommand = new TurnTvOff(newDevice);

        onPressed = new DeviceButton(oFFCommand);

        onPressed.press();

        buttonsList.addFirst(onPressed);

        // ------------------------

        Command volumeUpCommand = new TurnTvVolumeUp(newDevice);
        ;

        onPressed = new DeviceButton(volumeUpCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();

        buttonsList.addFirst(onPressed);
        buttonsList.addFirst(onPressed);
        buttonsList.addFirst(onPressed);

        // ------------------------

        ElectronicDevice theTv = new Television();
        ElectronicDevice theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(theTv);
        allDevices.add(theRadio);

        Command turnOffDevices = new TurnItAllOff(allDevices);

        onPressed = new DeviceButton(turnOffDevices);

        onPressed.press();

        buttonsList.addFirst(onPressed);

        // ------------------------

        System.out.println("Undo process");

        ListIterator<DeviceButton> commandListIterator = buttonsList.listIterator();

        commandListIterator.forEachRemaining(DeviceButton::pressUndo);

        Integer[] irray = {1, 2, 3, 4};

        Character[] crray = {'b', 'u', 'c', 'y'};

        Box.printMe(irray);

        Box.printMe(crray);

        System.out.println(Box.max(23, 42, 1, -3, 433, 0));
        System.out.println(Box.max("apples", "tots", "chicken"));

        Box<String> b = new Box<>("ee");

        int[] a = {1,2,3,4};

        modifyArray(a.clone());

        System.out.print("END");
    }

    public static void modifyArray(int[] b) {

        for (int i = 0; i < b.length; i++) {

            b[i] = b[i] * 2;
        }
    }

    private static class Box<T> {

        private T field;

        public Box(T field) {
            this.field = field;
        }

        public T getField() {
            return field;
        }

        private static <T> void printMe(T[] i) {

            for (T item : i) {

                System.out.printf("%s ", item);
            }

            System.out.println();
        }

        private static <T extends Comparable<T>> T max(T... items) {

            T maximum = items[0];

            for (T item : items) {

                if (item.compareTo(maximum) > 0) {

                    maximum = item;
                }
            }

            return maximum;
        }
    }
}
