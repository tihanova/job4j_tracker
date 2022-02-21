package ru.job4j.inheritance;

public class Engineer extends Profession {
    private boolean active;

    public Engineer(String name, String surname, String education, String birthday, boolean active) {
        super(name, surname, education, birthday);
        this.active = active;
    }

    public void train(Staff staff) {
        staff.setGrade(staff.getGrade() + 1);
        System.out.println("Подчиненный обучен");
    }
}
