package com.maksuu121.wwlt.enums;

import com.badlogic.gdx.graphics.Texture;
import com.maksuu121.wwlt.WorldWideLogisticsTycoon;

public enum TruckType {
    R730("Scania R730", WorldWideLogisticsTycoon.R730txt, 850, 730),
    R580("Scania R580", WorldWideLogisticsTycoon.R580txt, 500, 580);

    String name;
    Texture texture;
    int fuelMax;
    int horsePower;

    TruckType(String name, Texture texture, int fuelMax, int horsePower) {
        this.name = name;
        this.texture = texture;
        this.fuelMax = fuelMax;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public Texture getTexture() {
        return texture;
    }

    public int getFuelMax() {
        return fuelMax;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
