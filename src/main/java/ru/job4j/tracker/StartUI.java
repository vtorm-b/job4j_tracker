package ru.job4j.tracker;

public class StartUI {

    public void init(Input scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.println("Select: ");
            int select = Integer.parseInt(scanner.askStr("Выберите пункт меню:"));
            if (select == 0) {
                System.out.println("==Create add new Item==");
                System.out.print("Enter name: ");
                String name = scanner.askStr("Введите имя заявки:");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавлена заявка: " + item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Хранилище еще не содержит заявок");
                }
            } else if (select == 2) {
                System.out.println("===Edit item");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.askStr("Введите id заявки:"));
                System.out.println("Enter name: ");
                String name = scanner.askStr("Введите имя заявки:");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка изменена успешно.");
                } else {
                    System.out.println("Ошибка замены заявки.");
                }
            } else if (select == 3) {
                System.out.println("===Delete item===");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.askStr("Введите id заявки:"));
                if (tracker.delete(id)) {
                    System.out.println("Заявка удалена успешно");
                } else {
                    System.out.println("Ошибка удаления заявки");
                }
            } else if (select == 4) {
                System.out.println("===Find items by Id===");
                System.out.print("Enter Id");
                int id = Integer.parseInt(scanner.askStr("Введите id заявки:"));
                Item item = tracker.findById(id);
                System.out.println(item);
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.print("Enter name: ");
                String name = scanner.askStr("Введите имя заявки:");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с именем: " + name + " не найдены.");
                }
            } else if (select == 6) {
                    run = false;
                    System.out.println("Пользователь выбрал:" + select);
                } else {
                    run = false;
                }
            }
        }

        private void showMenu() {
        String[] menu  = {"Add new item", "Show all items", "Edit item",
                "Delete item",  "Find items by ID", "Find items by name", "Exit program"};
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
        System.out.println(i + "." + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}










