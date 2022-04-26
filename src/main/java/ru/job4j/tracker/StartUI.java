package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.println("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("==Create add new Item==");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавлена заявка: " + item);
            } else if (select == 6) {
                run = false;
                System.out.println("Пользователь выбрал:" + select);
            } else {
                run = false;
            }
            if (select == 1) {
                System.out.println("== Show all items==");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Хранилище не содержит заявок");
                }
            }
        }
    }

    private void showMenu() {
        String[] menu  = { "Add new item", "Show all items", "Edit item",
                "Delet item", "Find items by name", "Exit program" } ;
        System.out.println("Menu:");
        for(int i = 0; i < menu.length; i++) {
        System.out.println(i + "." + menu[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}








