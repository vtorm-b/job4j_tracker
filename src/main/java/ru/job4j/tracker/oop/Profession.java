package ru.job4j.tracker.oop;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;

    public Profession (String name, String surname, String education, int birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName();
    public String getSurname();
    public String getEducation();
    public int getBirthday();

    class Engineer extends Profession {
    }
    class Doctor extends  Profession {

    }



}
