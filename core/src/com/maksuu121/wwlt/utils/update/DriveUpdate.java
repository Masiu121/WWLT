package com.maksuu121.wwlt.utils.update;

import com.maksuu121.wwlt.utils.Trip;

public class DriveUpdate {
    public long timestamp;
    public Trip trip;

    public DriveUpdate(long timestamp, Trip trip) {
        this.timestamp = timestamp;
        this.trip = trip;
    }
}
