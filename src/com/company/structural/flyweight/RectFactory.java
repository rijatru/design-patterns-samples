package com.company.structural.flyweight;

import java.util.HashMap;
import java.awt.Color;
public class RectFactory {

    // The HashMap uses the color as the key for every
    // rectangle it will make up to 8 total

    private static final HashMap<Color, MyRect> rectsByColor = new HashMap<>();

    public static MyRect getRect(Color color) {

        // Add new rectangle to HashMap

        // Checks if a rectangle with a specific
        // color has been made. If not it makes a
        // new one, otherwise it returns one made already

        return rectsByColor.computeIfAbsent(color, k -> new MyRect(color));
    }
}
