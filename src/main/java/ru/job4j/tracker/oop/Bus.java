package ru.job4j.tracker.oop;

import ru.job4j.tracker.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(name + "автобус двигается по скоростным трассам");
    }
}
