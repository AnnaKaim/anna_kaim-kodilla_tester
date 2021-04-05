package com.kodilla.abstracts.homework;

public class SeniorAccountant extends Job{

    private static final int salary = 8000;
    private static final String responsibilities = "-Preparing financial reports, \n"
            + "-Performing account reconciliations, \n"
            + "-Maintaining the general ledger, \n"
            + "-Preparing tax returns, \n"
            + "-Assisting with audit preparations, \n"
            + "-Performing other accounting duties as assigned.";

    public SeniorAccountant() {
        super(salary, responsibilities);
    }

    @Override
    public void giveSalary() {
        System.out.println("PLN 8.000"); }

    @Override
    public void giveResponsibilities() {
        System.out.println("-Preparing financial reports, \n"
            + "-Performing account reconciliations, \n"
            + "-Maintaining the general ledger, \n"
            + "-Preparing tax returns, \n"
            + "-Assisting with audit preparations, \n"
            + "-Performing other accounting duties as assigned.");

    }
}
