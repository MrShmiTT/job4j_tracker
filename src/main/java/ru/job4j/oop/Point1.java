package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point1 {
    private int x;
    private int y;

    public Point1(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point1 that) {
        return sqrt(pow(this.x - that.x, 2) + (pow(this.y - that.y, 2)));
    }

    public static void main(String[] args) {
        Point1 a = new Point1(0, 0);
        Point1 b = new Point1(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}