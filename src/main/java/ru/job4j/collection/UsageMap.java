package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("shmitt87@mail.ru", "Aleksandr Vatutin");
        map.put("parsentev@yandex.ru", "Petr Arsentev");

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}