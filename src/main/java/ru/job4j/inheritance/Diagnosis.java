package ru.job4j.inheritance;

public class Diagnosis extends Doctor {
    private String typeOfPatients;
    private int patientsPerDay;

    public Diagnosis(int workExperience, int numberOfPatients, String licence,
                     String typeOfPatients, int patientsPerDay) {
        super();
        this.typeOfPatients = typeOfPatients;
        this.patientsPerDay = patientsPerDay;
    }

    private void knowEverything() {
    }
}
