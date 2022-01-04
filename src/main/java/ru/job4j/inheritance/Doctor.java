package ru.job4j.inheritance;

public class Doctor extends Profession {
    private int workExperience;
    private int numberOfPatients;
    private String licence;

    public Doctor(String name, String surname, String education, String birthday,
                  int workExperience, int numberOfPatients, String licence) {
        super(name, surname, education, birthday);
        this.workExperience = workExperience;
        this.numberOfPatients = numberOfPatients;
        this.licence = licence;
    }

    public Doctor() {
        super();
    }

    public void writeOnComb() {
    }

}

