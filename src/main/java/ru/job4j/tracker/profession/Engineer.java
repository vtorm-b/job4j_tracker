package ru.job4j.tracker.profession;

public class Engineer extends Profession {
    private String profession;
    private String specialization;

    public Engineer(String name, String surname, String education,
                    int birthday, String profession, String specialization) {

        super(name, surname, education, birthday);
        this.profession = profession;
        this.specialization = specialization;
    }
}

