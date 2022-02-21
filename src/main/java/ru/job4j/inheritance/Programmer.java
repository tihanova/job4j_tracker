package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String surname, String education, String birthday, boolean active, String language) {
        super(name, surname, education, birthday, active);
        this.language = language;
    }

    public String coding() {
        return "Новая программа, написанная на " + this.language;
    }
}
