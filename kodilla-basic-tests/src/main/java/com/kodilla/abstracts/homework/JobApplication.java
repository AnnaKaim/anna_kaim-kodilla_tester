package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {

        Job job = new Job() {
            @Override
            public void giveSalary() {
            }

            @Override
            public void giveResponsibilities() {
            }
        };

        Person person1 = new Person("Maciej", 34, "Senior Accountant");
        System.out.println(person1.getFirstName() + ", age " + person1.getAge() + ", " + person1.getJob() );
        Job seniorAccountant = new SeniorAccountant();
        person1.personsJobResponsibilities(seniorAccountant);

        Person person2 = new Person("Danuta", 55, "Chief Accountant");
        System.out.println(person2.getFirstName() + ", age " + person2.getAge() + ", " + person2.getJob() );
        Job chiefAccountant = new ChiefAccountant();
        person2.personsJobResponsibilities(chiefAccountant);

        Person person3 = new Person("Maria", 27, "Junior Accountant");
        System.out.println(person3.getFirstName() + ", age " + person3.getAge() + ", " + person3.getJob() );
        Job juniorAccountant = new JuniorAccountant();
        person3.personsJobResponsibilities(juniorAccountant);
    }
}
