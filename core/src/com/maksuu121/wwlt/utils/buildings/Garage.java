package com.maksuu121.wwlt.utils.buildings;

import com.maksuu121.wwlt.utils.vehicles.Trailer;
import com.maksuu121.wwlt.utils.vehicles.Truck;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    public List<Truck> trucks;
    public List<Trailer> trailers;

    public Garage() {
        trucks = new ArrayList<>();
        trailers = new ArrayList<>();
    }

    public void addTruck(Truck truck) {
        trucks.add(truck);
    }

    public void addTrailer(Trailer trailer) {
        trailers.add(trailer);
    }
}
