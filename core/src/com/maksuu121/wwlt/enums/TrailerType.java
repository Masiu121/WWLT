package com.maksuu121.wwlt.enums;

import com.badlogic.gdx.graphics.Texture;
import com.maksuu121.wwlt.WorldWideLogisticsTycoon;
import com.maksuu121.wwlt.gui.WWLTTexture;

public enum TrailerType {
    DEFAULT("Default trailer", WWLTTexture.defaultTrailer),
    CONTAINER("Container trailer", WWLTTexture.containerTrailer),
    TIPPER("Tipper trailer", WWLTTexture.tipperTrailer),
    COOLER("Cooler trailer", WWLTTexture.coolerTrailer),
    LIQUID("Liquid trailer", WWLTTexture.liquidTrailer),
    LOW("Low trailer", WWLTTexture.lowTrailer),
    CHEMICAL("Chemical trailer", WWLTTexture.chemicalTrailer),
    RADIOACTIVE("Radioactive trailer", WWLTTexture.radioactiveTrailer),
    HEAVY("Heavy trailer", WWLTTexture.heavyTrailer);

    String name;
    Texture texture;

    TrailerType(String name, Texture texture) {
        this.name = name;
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    public Texture getTexture() {
        return texture;
    }
}
