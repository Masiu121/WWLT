package com.maksuu121.wwlt.enums;

import com.badlogic.gdx.graphics.Texture;
import com.maksuu121.wwlt.WorldWideLogisticsTycoon;
import com.maksuu121.wwlt.gui.WWLTTexture;

public enum TireType {
    WINTER("Winter tires", WWLTTexture.winterTire),
    SUMMER("Summer tires", WWLTTexture.summerTire);

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
