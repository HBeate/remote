package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private boolean isOn;
    private boolean hasPower;
    private List<Battery> batteries;

    public Remote() {
        this.isOn = false;
        this.hasPower = false;
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery) {
        this.batteries.add(battery);
    }

    public boolean turnOff() {
        this.isOn = false;
        System.out.println("Remote is off.");
        return this.isOn;
    }

    public boolean turnOn() {
       int sumChargingStatus = this.batteries.get(0).getChargingStatus() + this.batteries.get(1).getChargingStatus();
       if (sumChargingStatus >=0 && sumChargingStatus <10){
           System.out.println("Not enough power.");
           return false;
       }
        this.batteries.get(0).inUse();
        this.batteries.get(1).inUse();
        if (this.isOn == true) {
            System.out.println("The remote is already on");
        } else {
            System.out.println("You turned the remote on.");
        }
        return this.isOn = true;
    }

    @Override
    public String toString() {
        return "Remote{" +
                "batteries=" + batteries +
                ", isOn=" + isOn +
                ", hasPower=" + hasPower +
                '}';
    }
}
