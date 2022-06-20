package ru.job4j.tracker;

public class FindByName implements UserAction{
    @Override
    public String name(){
        return "Find items by name.";
    }
    @Override
    public boolean execute(Input input, Tracker tracker){
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Введите имя заявки:");
        Item item= new Item(name);
        tracker.findByName(name);
                System.out.println(item);
                return true;
    }
}
