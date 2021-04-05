package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void personsJobResponsibilities(Job job) {
        System.out.println("Duties and responsibilities on this position include: ");
        job.giveResponsibilities();
        System.out.println("The salary is: ");
        job.giveSalary();
    }
}
