package ru.job4j.inheritance;

public class JuniorEngineer extends Engineer {
    private String skillBugFix;
    private int numberDeletedDb;

    public JuniorEngineer(String skillJava, String skillSql, String skillSpring, String skillBugFix, int numberDeletedDb) {
        super(skillJava, skillSql, skillSpring);
        this.skillBugFix = skillBugFix;
        this.numberDeletedDb = numberDeletedDb;
    }

    public JuniorEngineer deleteProdDB() {
        return deleteProdDB();
    }

    public void tryToFixBugs() {
    }
}
