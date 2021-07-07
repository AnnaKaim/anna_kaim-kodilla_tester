package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {

    Set<Order> orders = new HashSet<>();

    public static Set<Order> getOrderList() {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order(36.99, LocalDate.of(2021, Month.APRIL, 28), "TeddyBear"));
        orders.add(new Order(106.67, LocalDate.of(2021, Month.APRIL, 29), "Maria@44"));
        orders.add(new Order(89.12, LocalDate.of(2021, Month.APRIL, 29), "GaryBronson"));
        orders.add(new Order(207.00, LocalDate.of(2021, Month.APRIL, 30), "LittleFrog222"));
        orders.add(new Order(75.55, LocalDate.of(2021, Month.APRIL, 30), "Mr.Nice"));


        System.out.println(orders.size());
        for (Order order : orders)
            System.out.println(order);

        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int ordersListSize() {
        return orders.size();
    }

    public List<Order> getOrdersFromTwoDays(LocalDate startDate, LocalDate endDate) {
        List<Order> chosenOrders = new ArrayList<>();
        LocalDate date;
        for (Order order : orders) {
            date = order.getOrderDate();
            if ((date.isAfter(startDate) && date.isBefore(endDate)) || date.isEqual(startDate) || date.isEqual(endDate))
                chosenOrders.add(order);
        }
        return chosenOrders;
    }

    public List<Order> getOrdersInRange(double minPrice, double maxPrice) {
        return orders.stream().filter(
                o -> o.getPrice() > minPrice && o.getPrice() < maxPrice
        )
                .collect(Collectors.toList());

    }

    public double getTheOrdersValuesSum() {
        double  ordersSum = 0.0;
        for (Order order : orders)
            ordersSum += order.getPrice();
        return ordersSum;
    }
}