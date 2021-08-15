package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иван Иванович Петров");
        student.setGroupNumber(41);
        student.setEnterDate(new Date());

        System.out.println("Студент " + student.getFio() + " из группы " + student.getGroupNumber()
                + " поступил учиться " + student.getEnterDate());
    }
}
