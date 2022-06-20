package ru.job4j.tracker;

public class FindById implements UserAction{
    @Override
    public  String name(){
        return "Find items by Id";
    }
    @Override
    public  boolean execute(Input input,Tracker tracker){
        System.out.println("===Find items by Id===");
        int id = input.askInt("Введите id заявки:");
        String name = input.askStr("Введите имя заявки:");
        tracker.findById(id);
                    System.out.println("Заявка с введенным id: " + id);
        return true;
    }
}
