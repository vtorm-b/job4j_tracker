package ru.job4j.tracker.oop;

public class Max {
    public static int max(int left, int rigth) {
        return left > rigth ? left : rigth;
    }
    public static int max(int left, int rigth, int one) {
        int tmp = max(rigth, one);
        return max(left, tmp);
    }
    public static int max(int left, int rigth, int one, int two) {
        int tmp = max(rigth, one, two);
        return max(left, tmp);
    }
    public static void main(String[]args) {
        int rsl = Max.max(4,2);
        System.out.println("Максимальное число = " + rsl);
        int rsl1 = Max.max(6,2,8);
        System.out.println("Максимальное число = " + rsl1);
        int rsl2 = Max.max(2,5,1,9);
        System.out.println("Максимальное число = " + rsl2);
    }
}

