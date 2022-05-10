package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;

    private String name;

    private int countEngine;

    public Airbus(String name) {
        this.name = name;
        this.countEngine = COUNT_ENGINE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + this.getName());
    }

    @SuppressWarnings("checkstyle:LeftCurly")
    public void printCountEngine() {
        countEngine = (this.getName().equals("A380") ? 4 : COUNT_ENGINE);
        System.out.println("Количество двигателей равно: " + this.countEngine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + this.getName() + '\''
                + '}';
    }
}