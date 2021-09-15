package com.maksuu121.wwlt.enums;

import com.badlogic.gdx.graphics.Texture;
import com.maksuu121.wwlt.gui.WWLTTexture;

public enum TruckType {
    R730("Scania R730", WWLTTexture.R730, 850, 730, 1),
    R580("Scania R580", WWLTTexture.R580, 500, 580, 1),
    R520("Scania R520", WWLTTexture.R520, 500, 520, 1),
    R500("Scania R500", WWLTTexture.R500, 500, 500, 1),

    R490("Scania R490", WWLTTexture.R490, 500, 580, 1),
    R480("Scania R480", WWLTTexture.R480, 500, 580, 1),
    R450("Scania R450", WWLTTexture.R450, 500, 580, 1),
    R410("Scania R410", WWLTTexture.R410, 500, 580, 1),
    R370("Scania R370", WWLTTexture.R370, 500, 580, 1),

    R360("Scania R360", WWLTTexture.R360, 500, 580, 1),
    R340("Scania R340", WWLTTexture.R340, 500, 580, 1),
    R320("Scania R320", WWLTTexture.R320, 500, 580, 1),
    R280("Scania R280", WWLTTexture.R280, 500, 580, 1),
    R250("Scania R250", WWLTTexture.R250, 500, 580, 1);

    String name;
    Texture texture;
    int fuelMax;
    int horsePower;
    float price;

    TruckType(String name, Texture texture, int fuelMax, int horsePower, float price) {
        this.name = name;
        this.texture = texture;
        this.fuelMax = fuelMax;
        this.horsePower = horsePower;
        this.price = price;
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

    public float getPrice() {
        return price;
    }
}
