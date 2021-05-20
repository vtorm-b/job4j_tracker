package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private int price;
    private LocalDateTime created = LocalDateTime.now();

    public LocalDateTime getCreated(){
        return created;
    }

    public Item(String name) {
        this.name = name;
    }
    public Item(int id,String name, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Код товара: - " + id);
        System.out.println("Название товара: - " + name);
        System.out.println("Цена товара: - " + price + " руб.");
        System.out.println();
    }
    public static void main(String[] args) {
        Item first = new Item("тетрадь");
        first.printInfo();
        Item second = new Item(001,"карандаш", 10);
        second.printInfo();
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


