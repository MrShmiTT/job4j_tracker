package ru.job4j.ex;

public class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String message) {
        super(message);
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
                break;
            }
            if (value[i] != key) {
                throw new ElementNotFoundException("Element not found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] str = {"Ebay", "Amazon"};
        String key = "Ozon";

        try {
            indexOf(str, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}