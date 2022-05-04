package ru.job4j.tracker.oop;

import ru.job4j.tracker.Vehicle;

public class vehicleUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{airplane, train, bus};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
