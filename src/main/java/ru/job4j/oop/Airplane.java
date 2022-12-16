package ru.job4j.oop;

import ru.job4j.tracker.Vehicle;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(NM + "самолет летает по воздуху");
        System.out.println(TP + "Компания Аэрофлот");
    }

    @Override
    public void type() {
        }
}
