package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle[] vehicles = new Vehicle[]{bus, train, plane};
        for (Vehicle  v : vehicles) {
            System.out.println(v);
            v.move();
        }

    }
}

