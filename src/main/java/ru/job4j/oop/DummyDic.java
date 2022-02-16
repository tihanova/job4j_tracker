package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String w = "Неизвестное слово." + eng;
        return w;
    }

    public static void main(String[] args) {
        DummyDic diceng =  new DummyDic();
        String eng = "fly";
        String q = diceng.engToRus(eng);
        System.out.println(q);
    }
}
