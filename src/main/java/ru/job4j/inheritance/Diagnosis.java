package ru.job4j.inheritance;

public class Diagnosis extends Doctor {
    private String typeOfPatients;
    private int patientsPerDay;

    public Diagnosis() {
    }

    public Diagnosis(int workExperience, int numberOfPatients, String licence, String typeOfPatients, int patientsPerDay) {
        super(workExperience, numberOfPatients, licence);
        this.typeOfPatients = typeOfPatients;
        this.patientsPerDay = patientsPerDay;
    }

    private Diagnosis doDiagnostic() {
        return doDiagnostic();
    }

    private void knowEverything() {
    }
}