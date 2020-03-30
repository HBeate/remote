package com.company;

import java.util.function.DoubleToIntFunction;

public class Battery {
    private int chargingStatus = 100;
    private String size;

    public Battery(int chargingStatus, String size) {
        this.chargingStatus = chargingStatus; // in Prozent
        this.size = size;
    }

    public int getChargingStatus() {
        if (chargingStatus < 10) {
            System.out.println("Please change the batteries. You have " + this.chargingStatus + " percent left.");
        }
        return this.chargingStatus;
    }

    public void inUse() {
        if (this.chargingStatus >=10)
            this.chargingStatus -= 10;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Battery " +
                "chargingStatus = " + chargingStatus;
    }
}
