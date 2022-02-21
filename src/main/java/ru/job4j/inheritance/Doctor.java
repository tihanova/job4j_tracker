package ru.job4j.inheritance;

public class Doctor extends Profession {
    public int cabinet;

    public Doctor(String name, String surname, String education, String birthday, int cabinet) {
        super(name, surname, education, birthday);
            this.cabinet = cabinet;
    }

    public String diagnostic(Pacient pacient) {
        return "Симптомы пациента: " + pacient.getSymptom();
    }
}
