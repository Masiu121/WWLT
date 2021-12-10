package com.maksuu121.wwlt.utils.buildings;

import com.maksuu121.wwlt.WorldWideLogisticsTycoon;
import com.maksuu121.wwlt.enums.GarageLevel;
import com.maksuu121.wwlt.enums.TrailerType;
import com.maksuu121.wwlt.enums.TruckType;
import com.maksuu121.wwlt.utils.ErrorCode;
import com.maksuu121.wwlt.utils.vehicles.Trailer;
import com.maksuu121.wwlt.utils.vehicles.Truck;

import java.util.ArrayList;
import java.util.List;

public class Garage implements ErrorCode {
    List<Truck> trucks;
    List<Trailer> trailers;
    GarageLevel level;

    public Garage() {
        trucks = new ArrayList<>();
        trailers = new ArrayList<>();
        level = GarageLevel.FIRST;
    }

    public int buyTruck(TruckType truckType, Headquarters headquarters) {
        if(truckType.getPrice() <= WorldWideLogisticsTycoon.balance) {
            if(trucks.size() < level.maxTrucks) {
                Truck truck = new Truck(truckType, headquarters.getLocation());
                trucks.add(truck);
                return SUCCESS;
            }
            else
                return GARAGE_TOO_SMALL;
        }
        return NOT_ENOUGH_MONEY;
    }

    public int buyTrailer(TrailerType trailerType, Headquarters headquarters) {
        if(trailerType.getPrice() <= WorldWideLogisticsTycoon.balance) {
            if(trucks.size() < level.maxTrailers) {
                Trailer trailer = new Trailer(trailerType, headquarters.getLocation());
                trailers.add(trailer);
                return SUCCESS;
            }
            else
                return GARAGE_TOO_SMALL;
        }
        return NOT_ENOUGH_MONEY;
    }
}
