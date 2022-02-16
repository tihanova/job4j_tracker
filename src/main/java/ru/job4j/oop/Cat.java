package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Меня зовут: " + this.name);
        System.out.println("Я ел: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("котлета");
        gav.giveNick("Гав");
        gav.show();
        Cat blsck = new Cat();
        blsck.eat("рыбка");
        blsck.giveNick("Бродяга");
        blsck.show();
    }
}
