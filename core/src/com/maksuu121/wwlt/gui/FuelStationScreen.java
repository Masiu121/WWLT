package com.maksuu121.wwlt.gui;

import com.maksuu121.wwlt.utils.vehicles.Truck;

import java.sql.Timestamp;
import java.util.Date;

public class FuelStationScreen {
    private void refuel(Truck truck) {
        int litresToRefuel = truck.getFuelMax() - truck.getFuel();
        int timeToRefuel = litresToRefuel/2;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        truck.refuel();
    }
}
