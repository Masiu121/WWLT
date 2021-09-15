package com.maksuu121.wwlt.utils.vehicles;

import com.badlogic.gdx.graphics.Texture;
import com.maksuu121.wwlt.enums.TireType;

public class Tire {
    String name;
    Texture texture;
    int durability = 100;
    TireType tireType;

    public Tire(TireType tireType) {
        this.tireType = tireType;
        name = tireType.getName();
    }
}
