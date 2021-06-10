package ru.job4j.tracker;

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
       /* Item item = null;
        for (int index = 0; index < size; index++) {
            Item current = items[index];
            if (current.getId() == id) {
                item = current;
                break;
            }

        */
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                result[count++] = items[i];
            }
        }
        return Arrays.copyOf(result, count);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        /*int res = -1;
        for (int index = 0; index < id; index++) {
            if(items[index].getId() == (id));
            res = indexOf(id);}
        return res != -1? replace(id,item): null;
         */
        int index = indexOf(id);
        if (index != -1) {
            return index != -1;
            item.setId(id);
            items[index] = item;
        }
        return false;
    }
}






