package ru.job4j.tracker.oop;

import ru.job4j.tracker.Vehicle;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(name + "самолет летает по воздуху");
        System.out.println(type + "Компания Аэрофлот");
    }
    @Override
    public void type() {
        //System.out.println(type + "Компания Аэрофлот");
    }
}
