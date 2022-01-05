package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int rslSum = sum(5);
        System.out.println(rslSum);

        int rslMulti = calculator.multiply(5);
        System.out.println(rslMulti);

        int rslMinus = minus(5);
        System.out.println(rslMinus);

        int rslDivide = calculator.divide(5);
        System.out.println(rslDivide);

        int rslSumAll = calculator.sumAllOperation(5);
        System.out.println(rslSumAll);
    }
}
