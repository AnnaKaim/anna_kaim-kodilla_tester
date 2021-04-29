package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasksList() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Make an appointment - dr Gouda.", LocalDate.of(2021, Month.APRIL, 28), LocalDate.of(2021, Month.MAY, 5)));
        tasks.add(new Task("Make an appointment - dr Gouda2.", LocalDate.of(2021, 04, 28), LocalDate.of(2021, 05, 05)));
        tasks.add(new Task("Pick up grandma Jola from the airport.", LocalDate.of(2021, Month.APRIL, 29), LocalDate.of(2021, Month.MAY, 30)));
        tasks.add(new Task("Grandma Danusia photo exhibition.", LocalDate.of(2021, Month.MAY, 3), LocalDate.of(2021, Month.MAY, 3)));
        tasks.add(new Task("Buy a birthday present for Doti.", LocalDate.of(2021, Month.APRIL, 28), LocalDate.of(2021, Month.APRIL, 28)));
        return tasks;
    }
}
