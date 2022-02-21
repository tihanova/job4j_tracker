package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = surname;
        this.birthday = birthday;
    }

    public Profession() {
    }

    public String getName() {
        return this.getClass().getName();
    }
}

