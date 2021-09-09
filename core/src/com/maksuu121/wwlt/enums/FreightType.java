package com.maksuu121.wwlt.enums;

import java.util.Random;

public enum FreightType {
    APPLES(15),
    BEANS(12),
    BRICKS(20),
    CARROTS(17),
    CEMENT(22),
    CHEESE(17);

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
