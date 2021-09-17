package com.maksuu121.wwlt.utils.update;

import com.maksuu121.wwlt.enums.ActionType;

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
            }
        }
    }

    private void repairUpdate() {
        for(int i = 0; i < repairTime.size(); i++) {
            if(repairTime.get(i).timestamp <= timestamp.getTime()) {
                repairTime.get(i).vehicle.repair();
                repairTime.remove(i);
            }
        }
    }

    private void driveUpdate() {
        for(int i = 0; i < driveTime.size(); i++) {
            if(driveTime.get(i).timestamp <= timestamp.getTime()) {
                driveTime.get(i).trip.actionType = ActionType.NOTHING;
                driveTime.remove(i);
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
    }
}
