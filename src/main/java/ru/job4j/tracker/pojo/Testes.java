package ru.job4j.tracker.pojo;

public class Testes {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("milk", 1);
        products[1] = new Product("Bread", 2);
        products[2] = new Product("-",1);
        products[1] = null;
        for (int i = products.length -1; i > -1; i--) {
            System.out.println(i);
    }
}
}
