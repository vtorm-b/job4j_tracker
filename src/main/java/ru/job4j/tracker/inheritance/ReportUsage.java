package ru.job4j.tracker.inheritance;

import com.sun.tools.javac.Main;

public class ReportUsage {
    public static void main(String[] args) {
//        TextReport report = new TextReport();
//        String text = report.generate("name", "body");
//        System.out.println(text);
        JsonReport report1 = new JsonReport();
        String txt = report1.generate("name", "body");
        System.out.println(new JsonReport().generate("\"name\"", "\"body\""));
    }
}



