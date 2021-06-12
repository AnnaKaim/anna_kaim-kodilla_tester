package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >=40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("The average of posts number written by users in the age of 40 or older is: " + avg + ".");


        double avg2 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() <40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("The average of posts number written by users younger than 40 years old is: " + avg2 + ".");
    }

}
