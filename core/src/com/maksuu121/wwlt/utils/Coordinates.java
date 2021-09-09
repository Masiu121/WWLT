package com.maksuu121.wwlt.utils;

public class Coordinates {
    public double x, y;

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double getDistance(Coordinates coordinates1, Coordinates coordinates2) {
        return Math.sqrt(Math.pow(coordinates2.x - coordinates1.x, 2) + Math.pow(coordinates2.y - coordinates1.y, 2));
    }
}