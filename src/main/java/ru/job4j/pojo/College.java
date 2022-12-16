package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent("Sergey Gerasimov");
        student.setGroup("development");
        student.setCreated(new Date());
        System.out.println("студент: " + student.getStudent() + ", " + "группа: "
                + student.getGroup() + ", " + "дата: " + student.getCreated());
    }
}
