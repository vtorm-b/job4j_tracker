package ru.job4j.tracker.poly;

public interface Transport {
    String drive(String drive);

    default int passenger(String passenger) {
        return 0;
    }

    default int fuel(String price) {
        return 0;
    }
}
