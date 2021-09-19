package com.maksuu121.wwlt.utils.update;

import com.maksuu121.wwlt.utils.Trip;

public class LoadUpdate {
    public long timestamp;
    public Trip trip;

    public LoadUpdate(long timestamp, Trip trip) {
        this.timestamp = timestamp;
        this.trip = trip;
    }
}
