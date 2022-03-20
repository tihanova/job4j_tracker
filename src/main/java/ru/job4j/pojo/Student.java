package ru.job4j.pojo;

import java.time.LocalDateTime;

public class Student {
    public String fullName;
    public String group;
    public LocalDateTime dateGo;

    public static void main(String[] args) {

    }

    public LocalDateTime getDateGo() {
        return dateGo;
    }

    private void setDateGo(LocalDateTime dateGo) {
        this.dateGo = dateGo;
    }
}
