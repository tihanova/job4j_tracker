package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String type;

    public Surgeon(String name, String surname, String education,
                   String birthday, int cabinet, String type) {
        super(name, surname, education, birthday, cabinet);
        this.type = type;
    }

    public void nedRX(Pacient pacient) {
        if (pacient.getFracture()) {
            System.out.println("Вам нужен рентген");
        }
    }
}
