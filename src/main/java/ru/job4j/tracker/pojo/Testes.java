package ru.job4j.tracker.pojo;

public class Testes {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("milk", 1);
        products[1] = new Product("Bread", 2);
        products[2] = new Product("-",1);
        for (int i = products.length -1; i > -1; i--) {
            Product pr = products[i];
            System.out.println(pr);
    }
        products[1] = null;
        for (int i = 0; i < products.length; i++) {
            System.out.println(i);
        }
        Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 100);
        boolean eq = first.equals(second);
        System.out.println(eq);
}
}
