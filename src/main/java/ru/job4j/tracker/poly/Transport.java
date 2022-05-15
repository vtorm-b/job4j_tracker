package ru.job4j.tracker.poly;

public interface Transport {

    default int drive(int drive) {
        return 0;
    }

    default int passenger(int passenger) {
        return 0;
    }

    default int fuel(int price) {
        return 0;
    }
}
