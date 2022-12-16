package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(10);
        Battery second = new Battery(5);
        System.out.println("Старт " + one.load + " Космос " + second.load);
        one.exchange(second);
        System.out.println("Старт " + one.load + " Космос " + second.load);
    }
}
