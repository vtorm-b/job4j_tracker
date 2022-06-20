package ru.job4j.tracker;

public class findAllItems implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        String name = input.askStr("Введите номер заявки:");
        //Item item = new Item(name);
        tracker.findAll();
        System.out.println("Найдена заявка" + name);
           return true;
        }

        }

