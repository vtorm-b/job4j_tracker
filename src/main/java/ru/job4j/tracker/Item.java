package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;
    private int price;

    public Item(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Код товара " + id);
        System.out.println("Название товара " + name);
        System.out.println("Цена товара " + price);
        System.out.println();
    }
    public static void main(String[] args) {
        Item first = new Item();
        first.printInfo();

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


