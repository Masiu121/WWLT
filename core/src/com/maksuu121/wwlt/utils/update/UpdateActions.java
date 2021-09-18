package com.maksuu121.wwlt.utils.update;

import com.maksuu121.wwlt.enums.ActionType;
import com.maksuu121.wwlt.utils.Trip;
import com.maksuu121.wwlt.utils.vehicles.Truck;
import com.maksuu121.wwlt.utils.vehicles.Vehicle;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UpdateActions {
    List<RefuelUpdate> refuelTime;
    List<RepairUpdate> repairTime;
    List<DriveUpdate> driveTime;
    Timestamp timestamp;

    public UpdateActions() {
        refuelTime = new ArrayList<>();
        repairTime = new ArrayList<>();
        driveTime = new ArrayList<>();
        timestamp = new Timestamp(System.currentTimeMillis());
    }

    private void refuelUpdate() {
        for(int i = 0; i < refuelTime.size(); i++) {
            if(refuelTime.get(i).timestamp <= timestamp.getTime()) {
                refuelTime.get(i).truck.refuel();
                refuelTime.remove(i);
                update();
            }
        }
    }

    private void repairUpdate() {
        for(int i = 0; i < repairTime.size(); i++) {
            if(repairTime.get(i).timestamp <= timestamp.getTime()) {
                repairTime.get(i).vehicle.repair();
                repairTime.remove(i);
                update();
            }
        }
    }

    private void driveUpdate() {
        for(int i = 0; i < driveTime.size(); i++) {
            if(driveTime.get(i).timestamp <= timestamp.getTime()) {
                driveTime.get(i).trip.actionType = ActionType.NOTHING;
                driveTime.remove(i);
                update();
            }
        }
    }

    public void update() {
        timestamp = new Timestamp(System.currentTimeMillis());
        if(!refuelTime.isEmpty()) {
            refuelUpdate();
        }
        if(!repairTime.isEmpty()) {
            repairUpdate();
        }
        if(!driveTime.isEmpty()) {
            driveUpdate();
        }
    }

    public void addRefuelTime(long timestamp, Truck truck) {
        refuelTime.add(new RefuelUpdate(timestamp, truck));
    }

    public void addRepairTime(long timestamp, Vehicle vehicle) {
        repairTime.add(new RepairUpdate(timestamp, vehicle));
    }

    public void addDriveTime(long timestamp, Trip trip) {
        driveTime.add(new DriveUpdate(timestamp, trip));
    }
}
