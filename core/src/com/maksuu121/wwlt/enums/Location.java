package com.maksuu121.wwlt.enums;

import com.maksuu121.wwlt.gui.WWLTTexture;
import com.maksuu121.wwlt.utils.Coordinates;
import com.badlogic.gdx.graphics.Texture;
import java.util.Random;

public enum Location {
    POLAND(new Coordinates(51.9194, 19.1451), WWLTTexture.poland),
    GERMANY(new Coordinates(51.1657, 10.4515), WWLTTexture.germany),
    FRANCE(new Coordinates(46.2276, 2.2137), WWLTTexture.france),
    PORTUGAL(new Coordinates(39.3999, 8.2245), WWLTTexture.portugal),
    ITALY(new Coordinates(41.8719, 12.5674), WWLTTexture.italy);

    Coordinates coordinates;
    Texture flag;

    Location(Coordinates coordinates, Texture flag) {
        this.coordinates = coordinates;
        this.flag = flag;
    }

    public static Location getRandom() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Texture getFlag() {
        return flag;
    }
}
