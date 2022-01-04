package ru.job4j.oop;

public class Animal {
    private String nameClass = getClass().getSimpleName();

    public String getNameClass() {
        return nameClass;
    }

    public void sound() {
        System.out.println(nameClass + " Издает какой-то звук.");
    }
}
