package com.maksuu121.wwlt.utils;

import com.maksuu121.wwlt.enums.FreightType;
import com.maksuu121.wwlt.enums.TrailerType;

public class Trailer extends Vehicle{

    TrailerType trailerType;
    FreightType freightType;

    public Trailer(TrailerType trailerType, Location location) {
        super(trailerType.getName(), trailerType.getTexture(), location);
        this.trailerType = trailerType;
    }
}
