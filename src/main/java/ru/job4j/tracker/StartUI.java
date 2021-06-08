package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
       /* Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String result = item.getCreated().format(formatter);
        System.out.println(result);
        */
        Tracker tracker = new Tracker();
        tracker.add(new Item("test1"));
        Item item = tracker.findById(1);
        System.out.println(item);

    }


}








