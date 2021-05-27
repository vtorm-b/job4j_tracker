package ru.job4j.tracker.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length-1; i++) {
            products[i+1] = products[i];
            products[i] = null;
        }
        return products;
    }
}





