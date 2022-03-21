package ru.job4j.pojo;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Тиханова Анастасия");
        student.setGroup("943321");
        student.setDateGo("01-12-2009");
        System.out.println("Студент " + student.getFullName() + " обучается в вгруппе " + student.getGroup() + " с " + student.getDateGo());
    }
}
