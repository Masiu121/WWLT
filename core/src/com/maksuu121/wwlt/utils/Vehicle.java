package com.maksuu121.wwlt.utils;

import com.badlogic.gdx.graphics.Texture;
import com.maksuu121.wwlt.enums.ActionType;
import com.maksuu121.wwlt.enums.Location;

public abstract class Vehicle {
    public String name;
    Texture texture;
    int durability = 100;
    Location location;
    int mileage = 0;
    int age = 0;
    ActionType action = ActionType.NOTHING;

    public Vehicle(String name, Texture texture, Location location) {
        this.name = name;
        this.texture = texture;
        this.location = location;
    }

    void repair() {
        durability = 100;
    }

    void transfer(Location location) {
        this.location = location;
    }
}
