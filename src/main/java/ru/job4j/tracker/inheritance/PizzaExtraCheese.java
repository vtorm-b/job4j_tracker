package ru.job4j.tracker.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static String cheese;
    private static final String nm = cheese;
    public PizzaExtraCheese(String name) {
        super(name);
    }

    @Override
    public String name(){
        return nm + super.name();
    }
}

