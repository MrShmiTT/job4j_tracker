package ru.job4j.oop;

public class Animal {
    private String nameClass = getClass().getSimpleName();

    public void sound() {
        System.out.println(nameClass + " Издает какой-то звук.");
    }
}
