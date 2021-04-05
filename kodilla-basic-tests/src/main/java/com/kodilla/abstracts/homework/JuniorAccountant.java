package com.kodilla.abstracts.homework;

public class JuniorAccountant extends Job{

    private static final int salary = 4000;
    private static final String responsibilities = "-Posting journal entries, \n"
            + "-Updating financial statements, \n"
            + "-Maintaining accounts receivable and accounts payable, \n"
            + "-Paying monthly payroll, \n"
            + "-Preparing financial reports.";


    public JuniorAccountant() {
        super(salary, responsibilities);
    }

    @Override
    public void giveSalary() {
        System.out.println("PLN 4.000"); }

    @Override
    public void giveResponsibilities() {
        System.out.println("-Posting journal entries, \n"
            + "-Updating financial statements, \n"
            + "-Maintaining accounts receivable and accounts payable, \n"
            + "-Paying monthly payroll, \n"
            + "-Preparing financial reports.");

    }
}
