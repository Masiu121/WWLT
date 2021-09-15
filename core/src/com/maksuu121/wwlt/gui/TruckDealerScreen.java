package com.maksuu121.wwlt.gui;

import com.maksuu121.wwlt.WorldWideLogisticsTycoon;
import com.maksuu121.wwlt.enums.TrailerType;
import com.maksuu121.wwlt.enums.TruckType;
import com.maksuu121.wwlt.utils.buildings.Garage;
import com.maksuu121.wwlt.utils.buildings.Headquarters;
import com.maksuu121.wwlt.utils.vehicles.Trailer;
import com.maksuu121.wwlt.utils.vehicles.Truck;

public class TruckDealerScreen implements WWLTTexture {

    private void buyTruck(TruckType truckType, Headquarters headquarters, Garage garage) {
        if(truckType.getPrice() <= WorldWideLogisticsTycoon.balance) {
            Truck truck = new Truck(truckType, headquarters.getLocation());
            garage.addTruck(truck);
        }
    }

    private void buyTrailer(TrailerType trailerType, Headquarters headquarters, Garage garage) {
        if(trailerType.getPrice() <= WorldWideLogisticsTycoon.balance) {
            Trailer trailer = new Trailer(trailerType, headquarters.getLocation());
            garage.addTrailer(trailer);
        }
    }
}
