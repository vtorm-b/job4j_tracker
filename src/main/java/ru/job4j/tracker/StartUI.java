package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("==Create add new Item==");
        String name = input.askStr("Введите имя заявки:");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавлена заявка: " + item);
    }

    public static void findAllItems(Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("==Edit item==");
        int id = input.askInt("Введите id заявки:");
        String name = input.askStr("Введите имя заявки");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
        System.out.println("Заявка изменена успешно");
    } else {
            System.out.println("Ошибка замены заявки");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("==Delete item==");
        int id = input.askInt("Введите id заявки");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно");
        } else {
            System.out.println("Заявка удалена успешно");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("===Find items by Id===");
        int id = input.askInt("Введите id заявки:");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Введите имя заявки:");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Выберите пункт меню:");
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                findAllItems(tracker);
            } else if (select == 2) {
                editItem(input, tracker);
            }
            if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findById(input, tracker);
            } else if (select == 5) {
                findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {"Add new item", "Show all items", "Edit item",
                "Delete item", "Find items by ID", "Find items by name", "Exit program"};
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



















