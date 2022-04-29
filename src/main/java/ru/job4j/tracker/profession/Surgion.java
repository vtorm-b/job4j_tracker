package ru.job4j.tracker.profession;

public class Surgion extends Doctor {
    private String ambulatory;

    public Surgion(String name, String surname, String education,
                   int birthday, String pasient, String ambulatory) {
        super(name, surname, education, birthday, pasient);
        this.ambulatory = ambulatory;
    }

}
