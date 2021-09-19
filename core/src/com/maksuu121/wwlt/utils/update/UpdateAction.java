package com.maksuu121.wwlt.utils.update;

import com.maksuu121.wwlt.enums.ActionType;
import com.maksuu121.wwlt.enums.TripStatus;
import com.maksuu121.wwlt.utils.Trip;
import com.maksuu121.wwlt.utils.vehicles.Truck;
import com.maksuu121.wwlt.utils.vehicles.Vehicle;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UpdateAction {
    List<RefuelUpdate> refuelTime;
    List<RepairUpdate> repairTime;
    List<DriveUpdate> driveTime;
    List<LoadUpdate> loadTime;
    List<LoadUpdate> unloadTime;
    Timestamp timestamp;

    public UpdateAction() {
        refuelTime = new ArrayList<>();
        repairTime = new ArrayList<>();
        driveTime = new ArrayList<>();
        loadTime = new ArrayList<>();
        unloadTime = new ArrayList<>();
        timestamp = new Timestamp(System.currentTimeMillis());
    }

    private void refuelUpdate() {
        timestamp = new Timestamp(System.currentTimeMillis());
        for(int i = 0; i < refuelTime.size(); i++) {
            if(refuelTime.get(i).timestamp <= timestamp.getTime()) {
                refuelTime.get(i).truck.refuel();
                refuelTime.remove(i);
                update();
            }
        }
    }

    private void repairUpdate() {
        timestamp = new Timestamp(System.currentTimeMillis());
        for(int i = 0; i < repairTime.size(); i++) {
            if(repairTime.get(i).timestamp <= timestamp.getTime()) {
                repairTime.get(i).vehicle.repair();
                repairTime.remove(i);
                update();
            }
        }
    }

    private void driveUpdate() {
        timestamp = new Timestamp(System.currentTimeMillis());
        for(int i = 0; i < driveTime.size(); i++) {
            if(driveTime.get(i).timestamp <= timestamp.getTime()) {
                driveTime.get(i).trip.actionType = ActionType.NOTHING;
                driveTime.get(i).trip.tripStatus = TripStatus.ARRIVED;
                driveTime.remove(i);
                update();
            }
        }
    }

    private void loadUpdate() {
        timestamp = new Timestamp(System.currentTimeMillis());
        for(int i = 0; i < loadTime.size(); i++) {
            if(loadTime.get(i).timestamp <= timestamp.getTime()) {
                loadTime.get(i).trip.actionType = ActionType.NOTHING;
                loadTime.get(i).trip.tripStatus = TripStatus.LOADED;
                loadTime.remove(i);
                update();
            }
        }
    }

    private void unloadUpdate() {
        timestamp = new Timestamp(System.currentTimeMillis());
        for(int i = 0; i < unloadTime.size(); i++) {
            if(unloadTime.get(i).timestamp <= timestamp.getTime()) {
                unloadTime.get(i).trip.actionType = ActionType.NOTHING;
                unloadTime.get(i).trip.tripStatus = TripStatus.UNLOADED;
                unloadTime.remove(i);
                update();
            }
        }
    }

    public void update() {
        if(!refuelTime.isEmpty()) {
            refuelUpdate();
        }
        if(!repairTime.isEmpty()) {
            repairUpdate();
        }
        if(!driveTime.isEmpty()) {
            driveUpdate();
        }
        if(!loadTime.isEmpty()) {
            loadUpdate();
        }
        if(!unloadTime.isEmpty()) {
            unloadUpdate();
        }
    }

    public void addRefuelTime(long timeMilis, Truck truck) {
        refuelTime.add(new RefuelUpdate(timestamp.getTime() + timeMilis, truck));
    }

    public void addRepairTime(long timeMilis, Vehicle vehicle) {
        repairTime.add(new RepairUpdate(timestamp.getTime() + timeMilis, vehicle));
    }

    public void addDriveTime(long timeMilis, Trip trip) {
        driveTime.add(new DriveUpdate(timestamp.getTime() + timeMilis, trip));
    }

    public void addLoadTime(long timeMilis, Trip trip) {
        loadTime.add(new LoadUpdate(timestamp.getTime() + timeMilis, trip));
    }

    public void addUnloadTime(long timeMilis, Trip trip) {
        unloadTime.add(new LoadUpdate(timestamp.getTime() + timeMilis, trip));
    }
}
