package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolClasses = new HashMap<>();

        Principal barack = new Principal("Barack", "Obama");
        Principal bill = new Principal("Bill", "Clinton");
        Principal georg = new Principal("Georg W.", "Bush");
        Principal donald = new Principal("Donald", "Trump");


        School barackSchool = new School("Jefferson Elementary School", 27, 30, 25, 34, 27, 30, 28, 32);
        School billSchool = new School("Lafayette Elementary School", 29, 24, 25, 33, 27, 25, 30, 32);
        School georgSchool = new School("Sunset Elementary School", 26, 31, 26, 35, 25, 30, 28, 26);
        School donaldSchool = new School("Alamo Elementary School", 32, 32, 23, 28, 29, 25, 31, 32);


        schoolClasses.put(barack, barackSchool);
        schoolClasses.put(bill, billSchool);
        schoolClasses.put(georg, georgSchool);
        schoolClasses.put(donald, donaldSchool);


        for (Map.Entry<Principal, School> principalEntry : schoolClasses.entrySet()) {
            System.out.println(principalEntry.getKey().getFirstname()
                    + " " + principalEntry.getKey().getLastname()
                    + " is a headmaster of the "
                    + principalEntry.getValue().getSchoolName()
                    + ". The total number of pupils in this school is: " + principalEntry.getValue().getSum());
        }
    }
}
