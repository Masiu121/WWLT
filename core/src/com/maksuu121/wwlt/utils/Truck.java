package com.maksuu121.wwlt.utils;

import com.maksuu121.wwlt.enums.TireType;
import com.maksuu121.wwlt.enums.TruckType;

public class Truck extends Vehicle {

    int fuel;
    int fuelMax;
    int horsePower;
    Tire tire;

    public Truck(TruckType truckType, Location location) {
        super(truckType.getName(), truckType.getTexture(), location);
        fuelMax = truckType.getFuelMax();
        fuel = fuelMax;
        horsePower = truckType.getHorsePower();
        tire = new Tire(TireType.SUMMER);
    }

    public void changeTires(Tire tire) {
        this.tire = tire;
    }

    public void refuel() {
        fuel = fuelMax;
    }
}
