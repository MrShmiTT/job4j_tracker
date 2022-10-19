package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    public static final String SOME_EXTRA = " + extra cheese";

    public PizzaExtraCheese(String extra) {
        super(extra);
    }

    @Override
    public String name() {
        return super.name() + SOME_EXTRA;
    }
}
