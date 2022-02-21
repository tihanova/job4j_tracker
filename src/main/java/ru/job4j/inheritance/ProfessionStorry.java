package ru.job4j.inheritance;

public class ProfessionStorry {
    public static void main(String[] args) {
        Profession profession = new Profession("Настя", "Тиханова", "бакалавр", "30-01-1992");
        Pacient pacient = new Pacient("Болят зубы", 32, true);
        Doctor doctor = new Doctor("Егор", "Петров", "магистр", "09-11-1990", 202);
        Dentist dentist = new Dentist("Федор", "Сидоров", "магистр", "30-12-1988", 304, 2);
        Surgeon surgeon = new Surgeon("Алексей", "Титов", "бакалавр", "08-03-1998", 43, "пластическая хирургия");
        Engineer engineer = new Engineer("Сергей", "Иванов", "профессор", "09-11-1960", true);
        Staff staff = new Staff(1);
        Builder builder = new Builder("Виктор", "Земнев", "магистр", "22-01-1980", true, true);
        Programmer programmer = new Programmer("Данила", "Ветров", "доктор наук", "11-07-1980", false, "C++");
        System.out.println(profession.getName());
        System.out.println(doctor.diagnostic(pacient));
        System.out.println(dentist.getName());
        System.out.println(dentist.diagnostic(pacient));
        System.out.println("Стоимость гигиенической чистки зубов" + dentist.cleaningPrice(pacient));
        System.out.println(surgeon.getName());
        System.out.println(surgeon.diagnostic(pacient));
        surgeon.nedRX(pacient);
        System.out.println(engineer.getName());
        engineer.train(staff);
        System.out.println(builder.getName());
        builder.train(staff);
        builder.buildWalls();
        System.out.println(programmer.getName());
        programmer.train(staff);
        System.out.println(programmer.coding());
    }
}
