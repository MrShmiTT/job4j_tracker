package ru.job4j.oop;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("Самолет летит по небу");
    }

    @Override
    public void stop() {
        System.out.println("Самолет идет на посадку");
    }
}
