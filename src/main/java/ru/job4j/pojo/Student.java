package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.text.ParseException;

public class Student {
    public String fullName;
    public String group;
    public Date dateGo;

    public String getDateGo() {
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd-MM-yyyy");
        return formatForDateNow.format(dateGo);
    }

    public void setDateGo(String dateGoting) {
        try {
            dateGo  = new SimpleDateFormat("dd-MM-yyyy").parse(dateGoting);

        } catch (ParseException e) {
            System.out.println("Дата должна быть введена в формате dd-MM-yyyy");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
