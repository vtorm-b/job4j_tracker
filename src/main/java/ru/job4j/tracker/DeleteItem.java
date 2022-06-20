package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Delete item===");
        int id = input.askInt("Введите id заявки");
        String name = input.askStr(".");
        Item item = new Item(name);
        tracker.delete(id);
        System.out.println("Заявка удалена успешно");
        return true;
    }
}
