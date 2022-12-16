package ru.job4j.oop;

public class HierarchyUsage {
    private Car car = new Car();
    private Transport tp = car;
    private Object obj =  car;
    private Object ocar = new Car();
    private Car carFromObject = (Car) ocar;
    private Object biycycle = new Biycicle();
    private Object biycicle;
    private Car cb = (Car) biycicle;
}

