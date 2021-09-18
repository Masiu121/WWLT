package com.maksuu121.wwlt.utils.update;

import com.maksuu121.wwlt.utils.vehicles.Truck;
import com.maksuu121.wwlt.utils.vehicles.Vehicle;

public class RepairUpdate {
    public long timestamp;
    public Vehicle vehicle;

    public RepairUpdate(long timestamp, Vehicle vehicle) {
        this.timestamp = timestamp;
        this.vehicle = vehicle;
    }
}
