package com.maksuu121.wwlt.utils.buildings;

import com.maksuu121.wwlt.WorldWideLogisticsTycoon;
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
    int maxTrailers;
    int maxTrucks;
    int level;

    public Garage() {
        trucks = new ArrayList<>();
        trailers = new ArrayList<>();
    }

    private void setGarageSize() {
        switch(level) {
            case 1:
                maxTrailers = 2;
                maxTrucks = 2;
                break;
            case 2:
                maxTrailers = 4;
                maxTrucks = 4;
                break;
            case 3:
                maxTrailers = 8;
                maxTrucks = 8;
                break;
            case 4:
                maxTrailers = 14;
                maxTrucks = 14;
                break;
        }
    }

    public int buyTruck(TruckType truckType, Headquarters headquarters) {
        if(truckType.getPrice() <= WorldWideLogisticsTycoon.balance) {
            if(trucks.size() < maxTrucks) {
                Truck truck = new Truck(truckType, headquarters.getLocation());
                trucks.add(truck);
                return SUCCES;
            }
            else
                return GARAGE_TOO_SMALL;
        }
        return NOT_ENOUGH_MONEY;
    }

    public int buyTrailer(TrailerType trailerType, Headquarters headquarters) {
        if(trailerType.getPrice() <= WorldWideLogisticsTycoon.balance) {
            if(trucks.size() < maxTrailers) {
                Trailer trailer = new Trailer(trailerType, headquarters.getLocation());
                trailers.add(trailer);
                return SUCCES;
            }
            else
                return GARAGE_TOO_SMALL;
        }
        return NOT_ENOUGH_MONEY;
    }
}
