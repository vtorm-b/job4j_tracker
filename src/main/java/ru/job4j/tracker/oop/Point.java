package ru.job4j.tracker.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    public double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }
}