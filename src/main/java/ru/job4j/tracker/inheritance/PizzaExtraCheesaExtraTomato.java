package ru.job4j.tracker.inheritance;

public class PizzaExtraCheesaExtraTomato extends PizzaExtraCheese {
    private static String tomato;
    private static final String nm1 = tomato;
    public PizzaExtraCheesaExtraTomato(String name) {
        super(name);
    }

    @Override
    public String name(){
        return nm1 + super.name();
    }
}
