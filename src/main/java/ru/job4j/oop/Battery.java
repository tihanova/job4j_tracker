package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery batteryfirst = new Battery(30);
        Battery batterysecond = new Battery(50);
        System.out.println("before");
        System.out.println("batteryfirst load = " + batteryfirst.load);
        System.out.println("batterysecond load = " + batterysecond.load);
        batteryfirst.exchange(batterysecond);
        System.out.println("after");
        System.out.println("batteryfirst load = " + batteryfirst.load);
        System.out.println("batterysecond load = " + batterysecond.load);

    }
}
