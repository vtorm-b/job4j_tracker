package ru.job4j.tracker.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            Product tmp = products[i];
            if (tmp == null) {
                int j = i + 1;
                while(j < products.length && products[j] == null)
                    j++;
                if(j > products.length) {
                    products[j] = products[i];
                    products[i] = null;
                }
            }
        }
        return products;
    }

}





