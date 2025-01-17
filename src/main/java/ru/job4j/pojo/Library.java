package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Красная шапочка", 13);
        Book book2 = new Book("3 поросенка", 20);
        Book book3 = new Book("Черный плащ", 56);
        Book book4 = new Book("Лизелотта", 42);
        Book[] bk = new Book[4];
        bk[0] = book1;
        bk[1] = book2;
        bk[2] = book3;
        bk[3] = book4;
        Book book5 = new Book("Clean code", 666);
        bk[0] = book5;
        for (Book b : bk) {
            System.out.println(b.getName() + " - " + b.getPages());
        }
        extracted(bk);
    }

    private static void extracted(Book[] bk) {
        System.out.println(System.lineSeparator() + "=== Replacement 0 to 3 and 3 to 0 ===");
        Book b = bk[0];
        bk[0] = bk[3];
        bk[3] = b;

        for (Book book : bk) {
            b = book;
            System.out.println(b.getName() + " - " + b.getPages());
        }

        System.out.println(System.lineSeparator() + "=== Shown only Clean code book ===");
        for (Book book : bk) {
            b = book;
            if ("Clean code".equals(b.getName())) {
                System.out.println(b.getName() + " - " + b.getPages());
            }
        }
    }
}
