package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlize Theron ", null));
        students.add(new Student("Brad Pitt", new Teacher("Salma Hayeck")));
        students.add(new Student("Matt Dameon", null));
        students.add(new Student("Monika Belucci", new Teacher("Patrick Swayze")));
        students.add(new Student("Sandra Bullock", new Teacher("Uma Turmann")));

        Optional<Teacher> optionalTeacher = Optional.ofNullable(null);


        for (Student student : students) {
            if (optionalTeacher != null) {
                System.out.println("Student: " + student.getName() + ", teacher: " + student.getTeacher() + ".");
            } else if (optionalTeacher == null){
                System.out.println(" <undefined>");
            }
        }
    }
}
