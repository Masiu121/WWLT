package com.maksuu121.wwlt.enums;

import com.badlogic.gdx.graphics.Texture;
import com.maksuu121.wwlt.WorldWideLogisticsTycoon;

public enum TireType {
    WINTER("Winter tires", WorldWideLogisticsTycoon.winterTire),
    SUMMER("Summer tires", WorldWideLogisticsTycoon.summertire);

    String name;
    Texture texture;

    TireType(String name, Texture texture) {
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
