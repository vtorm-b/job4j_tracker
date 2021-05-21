package ru.job4j.tracker.encapsulation;

public class Config {
    String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }
    void print() {
        System.out.println(position);
    }
    public String getProperties(String key) {
        return search (key);
    }
    private String search(String key) {
        return key;
    }
}
