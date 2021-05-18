package ru.job4j.tracker.profession;

public class Engineer extends Profession {
    private String development;
    private String tester;

    public Engineer(String name, String surname, String education, int birthday, String development, String tester) {
        super(name, surname, education, birthday);
  }
}
