package com.maksuu121.wwlt.utils;

import com.maksuu121.wwlt.enums.TruckType;

public class Truck extends Vehicle {

    int fuel;
    int fuelMax;
    int horsePower;


    public Truck(TruckType truckType, Location location) {
        super(truckType.getName(), truckType.getTexture(), location);

    }
}
