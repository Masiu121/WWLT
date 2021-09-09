package com.maksuu121.wwlt.utils;

import com.maksuu121.wwlt.enums.FreightType;
import com.maksuu121.wwlt.enums.Location;

import java.text.DecimalFormat;

public class Trip {
    FreightType freight;
    Location startLocation;
    Location endLocation;
    double distance;
    double earnings;

    public Trip(FreightType freight, Location startLocation, Location endLocation, double distance, double earnings) {
        this.freight = freight;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.distance = distance;
        this.earnings = earnings;
    }

    public static Trip generate() {
        FreightType freightType = FreightType.getRandom();
        Location startLocation = Location.getRandom();
        Location endLocation = Location.getRandom();
        while(startLocation.equals(endLocation)) {
            endLocation = Location.getRandom();
        }

        double distance = Coordinates.getDistance(
                startLocation.getCoordinates(),
                endLocation.getCoordinates()
        );

        DecimalFormat format = new DecimalFormat("##.00");
        double earnings = Double.parseDouble(
                format.format(((freightType.getWeight() * 10) + distance) * 8)
        );

        return new Trip(
                freightType,
                startLocation,
                endLocation,
                distance,
                earnings
        );
    }

    /*
        Weight 10t-25t
        Distance 150km-2000km
        Earnings = (Weight * 10) + Distance * 8
     */
}
