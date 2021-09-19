package com.maksuu121.wwlt.utils;

import com.maksuu121.wwlt.WorldWideLogisticsTycoon;
import com.maksuu121.wwlt.enums.ActionType;
import com.maksuu121.wwlt.enums.FreightType;
import com.maksuu121.wwlt.enums.Location;
import com.maksuu121.wwlt.enums.TripStatus;
import com.maksuu121.wwlt.utils.update.UpdateAction;
import com.maksuu121.wwlt.utils.vehicles.Trailer;
import com.maksuu121.wwlt.utils.vehicles.Truck;

import java.text.DecimalFormat;

public class Trip implements ErrorCode {
    FreightType freight;
    Location startLocation;
    Location endLocation;
    Employee driverEmployee;
    Employee warehouseEmployee;
    Employee managerEmployee;
    Trailer trailer;
    Truck truck;
    double distance;
    double earnings;
    public TripStatus tripStatus;
    public ActionType actionType;

    public Trip(FreightType freight, Location startLocation, Location endLocation, double distance, double earnings) {
        this.freight = freight;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.distance = distance;
        this.earnings = earnings;
        actionType = ActionType.NOTHING;
        tripStatus = TripStatus.ACCEPTED;
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

    void selectDriver(Employee driverEmployee) {
        this.driverEmployee = driverEmployee;
    }

    void selectManager(Employee managerEmployee) {
        this.driverEmployee = managerEmployee;
    }

    void selectWarehouseEmployee(Employee warehouseEmployee) {
        this.warehouseEmployee = warehouseEmployee;
    }

    void selectTruck(Truck truck) {
        this.truck = truck;
    }

    void selectTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    void nextAction(UpdateAction updateAction) {
        switch(tripStatus) {
            case ACCEPTED:
                load(updateAction);
                break;
            case LOADED:
                drive(updateAction);
                break;
            case ARRIVED:
                unload(updateAction);
                break;
            case UNLOADED:
                finish(updateAction);
                break;
        }
    }

    int load(UpdateAction updateAction) {
        if(trailer != null) {
            if(warehouseEmployee != null) {
                actionType = ActionType.LOADING;
                updateAction.addLoadTime(30000, this);
            }
            else
                return NO_WAREHOUSE_EMPLOYEE_SELECTED;
        }
        return NO_TRAILER_SELECTED;
    }

    int drive(UpdateAction updateAction) {
        if(truck != null) {
            if(driverEmployee != null) {
                actionType = ActionType.DRIVING;
                updateAction.addDriveTime(1, this);
            }
            else
                return NO_DRIVER_EMPLOYEE_SELECTED;
        }
        return NO_TRUCK_SELECTED;
    }

    int unload(UpdateAction updateAction) {
        if(trailer.getAction() == ActionType.NOTHING) {
            actionType = ActionType.UNLOADING;
            updateAction.addUnloadTime(1, this);
        }
        return TRAILER_NOT_AVAILABLE;
    }

    int finish(UpdateAction updateAction) {
        if(managerEmployee != null) {
            actionType = ActionType.FINISHING;
            updateAction.addFinishTime(1, this);
        }
        return NO_MANAGER_EMPLOYEE_SELECTED;
    }

    public void finishTrip() throws Throwable {
        WorldWideLogisticsTycoon.balance += earnings;
        this.finalize();
    }

    /*
        Weight 10t-25t
        Distance 150km-2000km
        Earnings = (Weight * 10) + Distance * 8
        
        Time = distance/truckMaxSpeed + 500*(hp/((t*10)*2))
     */
}
