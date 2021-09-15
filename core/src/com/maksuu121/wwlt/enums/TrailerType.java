package com.maksuu121.wwlt.enums;

import com.badlogic.gdx.graphics.Texture;
import com.maksuu121.wwlt.WorldWideLogisticsTycoon;
import com.maksuu121.wwlt.gui.WWLTTexture;

public enum TrailerType {
    DEFAULT("Default trailer", WWLTTexture.defaultTrailer, 1),
    CONTAINER("Container trailer", WWLTTexture.containerTrailer, 1),
    TIPPER("Tipper trailer", WWLTTexture.tipperTrailer, 1),
    COOLER("Cooler trailer", WWLTTexture.coolerTrailer, 1),
    LIQUID("Liquid trailer", WWLTTexture.liquidTrailer, 1),
    LOW("Low trailer", WWLTTexture.lowTrailer, 1),
    CHEMICAL("Chemical trailer", WWLTTexture.chemicalTrailer, 1),
    RADIOACTIVE("Radioactive trailer", WWLTTexture.radioactiveTrailer, 1),
    HEAVY("Heavy trailer", WWLTTexture.heavyTrailer, 1);

    String name;
    Texture texture;
    float price;

    TrailerType(String name, Texture texture, float price) {
        this.name = name;
        this.texture = texture;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Texture getTexture() {
        return texture;
    }

    public float getPrice() {
        return price;
    }
}
