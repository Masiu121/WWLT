package com.maksuu121.wwlt.enums;

import com.badlogic.gdx.graphics.Texture;
import com.maksuu121.wwlt.gui.WWLTTexture;

public enum TruckType {
    R730("Scania R730", WWLTTexture.R730, 850, 730),
    R580("Scania R580", WWLTTexture.R580, 500, 580),
    R520("Scania R520", WWLTTexture.R580, 500, 520),
    R500("Scania R500", WWLTTexture.R580, 500, 500),

    R490("Scania R490", WWLTTexture.R580, 500, 580),
    R480("Scania R480", WWLTTexture.R580, 500, 580),
    R450("Scania R450", WWLTTexture.R580, 500, 580),
    R410("Scania R410", WWLTTexture.R580, 500, 580),
    R370("Scania R370", WWLTTexture.R580, 500, 580),

    R360("Scania R360", WWLTTexture.R580, 500, 580),
    R340("Scania R340", WWLTTexture.R580, 500, 580),
    R320("Scania R320", WWLTTexture.R580, 500, 580),
    R280("Scania R280", WWLTTexture.R580, 500, 580),
    R250("Scania R250", WWLTTexture.R580, 500, 580);

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
