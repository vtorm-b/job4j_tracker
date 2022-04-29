package ru.job4j.tracker.profession;

public class Doctor extends Profession {
    private String diagnosis;
    private String attendingPhysician;
    private String pacient;

    public Doctor(String name, String surname, String education, int birthday, String pasient) {
        super(name, surname, education, birthday);
        this.pacient = pasient;
    }

    public Doctor(String name, String surname, String education,
                  int birthday, String diagnosis, String attendingPhysician) {
        super(name, surname, education, birthday);
        this.diagnosis = diagnosis;
        this.attendingPhysician = attendingPhysician;
    }
}
