package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int pricePerTooth;

    public Dentist(String name, String surname, String education,
                   String birthday, int cabinet, int pricePerTooth) {
        super(name, surname, education, birthday, cabinet);
        this.pricePerTooth = pricePerTooth;
    }

    public int cleaningPrice(Pacient pacient) {
        return pacient.getTeeths() * this.pricePerTooth;
    }

}
