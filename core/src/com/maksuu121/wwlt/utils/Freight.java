package com.maksuu121.wwlt.utils;

import com.maksuu121.wwlt.enums.FreightType;
import com.maksuu121.wwlt.enums.Location;

public class Freight {
    FreightType freightType;
    Location startLocation;
    Location endLocation;

    public Freight(FreightType freightType, Location startLocation, Location endLocation) {
        this.freightType = freightType;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }


}
