package com.maksuu121.wwlt.enums;

import com.badlogic.gdx.graphics.Texture;
import com.maksuu121.wwlt.WorldWideLogisticsTycoon;

public enum TrailerType {
    DEFAULT("Default trailer", WorldWideLogisticsTycoon.defaultTrailer),
    CONTAINER("Container trailer", WorldWideLogisticsTycoon.containerTrailer),
    TIPPER("Tipper trailer", WorldWideLogisticsTycoon.tipperTrailer),
    COOLER("Cooler trailer", WorldWideLogisticsTycoon.coolerTrailer),
    LIQUID("Liquid trailer", WorldWideLogisticsTycoon.liquidTrailer),
    LOW("Low trailer", WorldWideLogisticsTycoon.lowTrailer),
    CHEMICAL("Chemical trailer", WorldWideLogisticsTycoon.chemicalTrailer),
    RADIOACTIVE("Radioactive trailer", WorldWideLogisticsTycoon.radioactiveTrailer),
    HEAVY("Heavy trailer", WorldWideLogisticsTycoon.heavyTrailer);

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
