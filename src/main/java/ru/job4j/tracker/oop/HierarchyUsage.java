package ru.job4j.tracker.oop;

public class HierarchyUsage {
    Car car = new Car();
    Transport tp = car;
    Object obj =  car;
    Object ocar = new Car();
    Car carFromObject = (Car) ocar;
    Object biycycle = new Biycicle();
    private Object biycicle;
    Car cb = (Car) biycicle;
}
