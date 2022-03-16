package ru.job4j.inheritance;

public class Builder extends Engineer {
    private boolean foreman;

    public Builder(String name, String surname, String education, String birthday, boolean active, boolean foreman) {
        super(name, surname, education, birthday, active);
        this.foreman = foreman;
    }

    public void buildWalls() {
        System.out.println("Возвел стену");
    }
}
