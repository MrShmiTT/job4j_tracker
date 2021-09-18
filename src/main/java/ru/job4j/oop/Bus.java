package ru.job4j.oop;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Автобус едет по трассе");
    }

    @Override
    public void stop() {
        System.out.println("Автобус останавливается на остановке");
    }
}
