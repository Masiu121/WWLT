package com.maksuu121.wwlt.utils.update;

import com.maksuu121.wwlt.utils.vehicles.Truck;

public class RefuelUpdate {
    public long timestamp;
    public Truck truck;

    public RefuelUpdate(long timestamp, Truck truck) {
        this.timestamp = timestamp;
        this.truck = truck;
    }
}
