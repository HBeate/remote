package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Battery b1 = new Battery(100, "AAA");
        Battery b2 = new Battery(50, "AAA");

        Remote remote1 = new Remote();

        remote1.addBattery(b1);
        remote1.addBattery(b2);
        System.out.println("Ladekapazität: " + b1);
        System.out.println("Ladekapazität: " + b2);
        remote1.turnOff();
        remote1.turnOn();
        remote1.turnOn();
        remote1.turnOff();
        remote1.turnOff();
        remote1.turnOn();
        remote1.turnOff();
        remote1.turnOff();
        remote1.turnOn();
        remote1.turnOff();
        remote1.turnOn();
        remote1.turnOff();
        remote1.turnOn();
        remote1.turnOff();
        remote1.turnOn();
        remote1.turnOff();
        remote1.turnOn();
        remote1.turnOff();
    }


}
