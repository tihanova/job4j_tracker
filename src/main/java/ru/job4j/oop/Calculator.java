package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return (sum(d) + multiply(d) + minus(d) + divide(d));
    }

    public static void main(String[] args) {
        int rlsSum = sum(10);
        Calculator calculator = new Calculator();
        int rlsMinus = minus(10);
        int rlsMultiply = calculator.multiply(10);
        int rlsDivide = calculator.divide(10);
        int rlsSumAll = calculator.sumAllOperation(10);
        System.out.println(rlsSum);
        System.out.println(rlsMinus);
        System.out.println(rlsMultiply);
        System.out.println(rlsDivide);
        System.out.println(rlsSumAll);
    }
}
