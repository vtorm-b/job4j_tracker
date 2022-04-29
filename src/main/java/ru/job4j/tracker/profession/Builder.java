package ru.job4j.tracker.profession;

public class Builder extends Engineer {
    private String specialization;

    public Builder(String name, String surname, String education, int birthday,
                   String profession, String specialization, String specialization1) {
        super(name, surname, education, birthday, profession, specialization);
        this.specialization = specialization1;
    }
}
