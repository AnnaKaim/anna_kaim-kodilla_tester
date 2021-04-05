package com.kodilla.abstracts.homework;

public class ChiefAccountant extends Job {

    private static final int salary = 12000;
    private static final String responsibilities = "-Manage and oversee the entire accounting team, \n" +
            "-Conduct all necessary training to keep the team's skills and knowledge up to date, \n" +
            "-See that tax interviews are conducted properly with clients, \n" +
            "-Ensure that all necessary documents are requested, collected, and compiled. ";


    public ChiefAccountant() {
        super(salary, responsibilities);
    }

    @Override
    public void giveSalary() {
        System.out.println("PLN 12.000"); }

    @Override
    public void giveResponsibilities() {
        System.out.println("-Manage and oversee the entire accounting team, \n" +
            "-Conduct all necessary training to keep the team's skills and knowledge up to date, \n" +
            "-See that tax interviews are conducted properly with clients, \n" +
            "-Ensure that all necessary documents are requested, collected, and compiled. ");
    }
}
