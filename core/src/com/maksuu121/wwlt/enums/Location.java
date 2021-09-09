package com.maksuu121.wwlt.enums;

import com.maksuu121.wwlt.utils.Coordinates;

import java.util.Random;

public enum Location {
    POLAND(new Coordinates(51.9194, 19.1451)),
    GERMANY(new Coordinates(51.1657, 10.4515)),
    FRANCE(new Coordinates(46.2276, 2.2137)),
    PORTUGAL(new Coordinates(39.3999, 8.2245)),
    ITALY(new Coordinates(41.8719, 12.5674));

    Coordinates coordinates;

    Location(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public static Location getRandom() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}
