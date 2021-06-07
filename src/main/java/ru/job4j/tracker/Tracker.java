package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        for (int i = 0, j = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                result[j++] = items[i];
            }
        }
        return result;
    }
    private int indexOf(int id) {
       int rsl = -1;
        for (int index = 0; index < size; index++) {
            if(items[index].getId() == (id));
            rsl = index;
        }
        return rsl;
    }
    public boolean replace(int id, Item item) {
        int res = -1;
        for (int index = 0; index < id; index++) {
            if(items[index].getId() == (id));
            res = indexOf(id);
        }
        return res != -1? replace(id,item): null;
    }
}




