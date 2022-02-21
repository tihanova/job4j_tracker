package ru.job4j.inheritance;

public class Pacient {
    private String symptom;
    private int teeths;
    private boolean fracture;

    public Pacient(String symptom, int teeths, boolean fracture) {
        this.symptom = symptom;
        this.teeths = teeths;
        this.fracture = fracture;
    }

    public String getSymptom() {
        return this.symptom;
    }

    public boolean getFracture() {
        return this.fracture;
    }

    public int getTeeths() {
        return this.teeths;
    }
}
