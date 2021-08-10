package ru.job4j.inheritance;

public class MiddleEngineer extends Engineer {
    private int numberInterns;
    private int pointsToSenior;

    public MiddleEngineer() {
    }

    public MiddleEngineer(String skillJava, String skillSql, String skillSpring, int numberInterns, int pointsToSenior) {
        super(skillJava, skillSql, skillSpring);
        this.numberInterns = numberInterns;
        this.pointsToSenior = pointsToSenior;
    }

    public MiddleEngineer teachInterns() {
        return teachInterns();
    }

    public void getPoints() {
    }
}
