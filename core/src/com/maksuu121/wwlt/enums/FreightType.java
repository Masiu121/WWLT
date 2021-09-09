package com.maksuu121.wwlt.enums;

import java.util.Random;

public enum FreightType {
    NULL(0);

    int weight;

    FreightType(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public static FreightType getRandom() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
