package com.maksuu121.wwlt.enums;

public enum FreightType {
    NULL(0);

    int weight;

    FreightType(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
