package com.maksuu121.wwlt.utils.buildings;

import com.maksuu121.wwlt.WorldWideLogisticsTycoon;
import com.maksuu121.wwlt.enums.TrailerType;
import com.maksuu121.wwlt.enums.TruckType;
import com.maksuu121.wwlt.utils.vehicles.Trailer;
import com.maksuu121.wwlt.utils.vehicles.Truck;

import java.util.ArrayList;
import java.util.List;

public class Garage {
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
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    public boolean buyTruck(TruckType truckType, Headquarters headquarters, Garage garage) {
        if(truckType.getPrice() <= WorldWideLogisticsTycoon.balance && trucks.size() < maxTrucks) {
            Truck truck = new Truck(truckType, headquarters.getLocation());
            trucks.add(truck);
            return true;
        }
        return false;
    }

    public boolean buyTrailer(TrailerType trailerType, Headquarters headquarters, Garage garage) {
        if(trailerType.getPrice() <= WorldWideLogisticsTycoon.balance && trucks.size() < maxTrailers) {
            Trailer trailer = new Trailer(trailerType, headquarters.getLocation());
            trailers.add(trailer);
            return true;
        }
        return false;
    }
}
