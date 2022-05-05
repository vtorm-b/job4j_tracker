package ru.job4j.tracker.oop;

public class Max {
    public static int max(int left, int rigth) {
        return left > rigth ? left : rigth;
    }

    public static int max(int left, int rigth, int one) {
        return max(left, max(rigth, one));
    }

    public static int max(int left, int rigth, int one, int two) {
        return max(left, max(rigth, one, two));
    }

    public static void main(String[]args) {
        int rsl = Max.max(4, 2);
        System.out.println("Максимальное число = " + rsl);
        int rsl1 = Max.max(6, 2, 8);
        System.out.println("Максимальное число = " + rsl1);
        int rsl2 = Max.max(2, 5, 1, 9);
        System.out.println("Максимальное число = " + rsl2);
    }
}

