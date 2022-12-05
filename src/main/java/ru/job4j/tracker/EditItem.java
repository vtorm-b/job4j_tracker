package ru.job4j.tracker;

public class EditItem implements UserAction {
    @Override
    public String name() {
        return "Edit item.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==Edit item==");
        int id = input.askInt("Введите id заявки.");
        String name = input.askStr("Введите имя заявки");
        Item item = new Item(name);
        tracker.replace(id, item) ;
            System.out.println("Заявка изменена успешно");

            //System.out.println("Ошибка замены заявки");

        return true;
    }
}
