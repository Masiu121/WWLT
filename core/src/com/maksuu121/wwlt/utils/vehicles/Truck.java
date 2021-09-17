package com.maksuu121.wwlt.utils.vehicles;

import com.maksuu121.wwlt.enums.ActionType;
import com.maksuu121.wwlt.enums.Location;
import com.maksuu121.wwlt.enums.TireType;
import com.maksuu121.wwlt.enums.TruckType;
import com.maksuu121.wwlt.utils.Trip;

public class Truck extends Vehicle {

    int fuel;
    int fuelMax;
    int horsePower;
    Tire tire;
    TruckType truckType;
    Trip trip;

    public Truck(TruckType truckType, Location location) {
        super(truckType.getName(), truckType.getTexture(), location);
        this.truckType = truckType;
        fuelMax = truckType.getFuelMax();
        fuel = fuelMax;
        horsePower = truckType.getHorsePower();
        tire = new Tire(TireType.SUMMER);
        trip = null;
    }

    public void changeTires(Tire tire) {
        this.tire = tire;
    }

    public void refuel() {
        fuel = fuelMax;
        action = ActionType.NOTHING;
    }

    public int getFuel() {
        return fuel;
    }

    public int getFuelMax() {
        return fuelMax;
    }
}
