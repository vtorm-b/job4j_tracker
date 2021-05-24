package ru.job4j.tracker.pojo;

public class Book {
    private  String name;
    private int count;

    public Book(String name){
        this.name = name;
        this.count = count;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
