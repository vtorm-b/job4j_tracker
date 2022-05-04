package ru.job4j.tracker.oop;

import ru.job4j.tracker.Vehicle;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(name + "поезд передвигается по рельсам");

    }
}
