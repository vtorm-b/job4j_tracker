package ru.job4j.tracker.profession;

public class Programmer extends Engineer {
    private String development;
    private String tester;

    public Programmer(String name, String surname, String education, int birthday, String profession,
                      String specialization, String development, String tester) {
        super(name, surname, education, birthday, profession, specialization);
        this.development = development;
        this.tester = tester;
    }
}
