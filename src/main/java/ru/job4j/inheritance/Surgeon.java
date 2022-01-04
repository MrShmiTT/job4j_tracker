package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String surgeonSpecialization;
    private int aliveStatistic;

    public Surgeon(int workExperience, int numberOfPatients, String licence,
                   String surgeonSpecialization, int aliveStatistic) {
        super();
        this.surgeonSpecialization = surgeonSpecialization;
        this.aliveStatistic = aliveStatistic;
    }

    public void sew() {
    }
}
