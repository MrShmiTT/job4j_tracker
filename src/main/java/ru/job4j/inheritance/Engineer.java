package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String skillJava;
    private String skillSql;
    private String skillSpring;

    public Engineer() {
        super();
    }

    public Engineer(String name, String surname, String education, String birthday, String skillJava, String skillSql, String skillSpring) {
        super(name, surname, education, birthday);
        this.skillJava = skillJava;
        this.skillSql = skillSql;
        this.skillSpring = skillSpring;
    }

    public Engineer readSof() {
        return readSof();
    }

    public void copyPaste() {
    }

}