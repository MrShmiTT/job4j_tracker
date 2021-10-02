package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (int i = 0; i < abuses.length; i++) {
            if (value.equals(abuses[i])) {
                throw new ElementAbuseException("Element abused");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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