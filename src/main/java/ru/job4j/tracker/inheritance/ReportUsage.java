package ru.job4j.tracker.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JsonReport report1 = new JsonReport();
        String txt = report1.generate("name", "body");
        System.out.println(new JsonReport().generate("\"name\"", "\"body \""));
    }
}



