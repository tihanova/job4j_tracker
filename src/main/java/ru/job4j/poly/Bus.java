package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус движется");
    }

    @Override
    public void passengeres(int number) {
        System.out.println("Количество пассажиров: " + number);
    }

    @Override
    public float refuel(float volume) {
        float cost = 2;
        return volume * cost;
    }
}
