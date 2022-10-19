package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    public static final String SOME_EXTRA = " + extra tomato";

    public PizzaExtraCheeseExtraTomato(String extra) {
        super(extra);
    }

    @Override
    public String name() {
        return super.name() + SOME_EXTRA;
    }
}
