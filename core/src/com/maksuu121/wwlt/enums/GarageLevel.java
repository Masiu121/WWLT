package com.maksuu121.wwlt.enums;

public enum GarageLevel {
    FIRST(2, 2, 0),
    SECOND(4, 4, 2.048f),
    THIRD(8, 8, 4.096f);

    public int maxTrucks, maxTrailers;
    float price;

    GarageLevel(int maxTrucks, int maxTrailers, float price) {
        this.maxTrucks = maxTrucks;
        this.maxTrailers = maxTrailers;
        this.price = price;
    }
}
