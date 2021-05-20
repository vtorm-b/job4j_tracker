package ru.job4j.tracker.inheritance;

public class JsonReport extends TextReport {
    @Override
    public String generate (String name, String body){
        char a = 34;
        return "{" +  System.lineSeparator() + a + name + a + " : " + a + "name" + a + "," +
                System.lineSeparator() + a + body + a +  " : " + a + "body" + a +  System.lineSeparator() + "}";
    }
}
