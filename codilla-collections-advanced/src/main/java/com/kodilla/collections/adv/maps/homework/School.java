package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Double> schoolClasses = new ArrayList<>();
    private String schoolName;


    public School(String schoolName, double... schoolClasses) {
        this.schoolName = schoolName;

        for (double schoolClass : schoolClasses)
            this.schoolClasses.add(schoolClass);
    }

    public double getSum() {
        double sum = 0.0;
        for (double schoolClass : schoolClasses)
            sum += schoolClass;
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolClasses, school.schoolClasses) && Objects.equals(schoolName, school.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolClasses, schoolName);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolClasses=" + schoolClasses +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}