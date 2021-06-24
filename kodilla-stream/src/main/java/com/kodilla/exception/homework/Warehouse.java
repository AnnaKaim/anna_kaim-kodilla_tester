package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;


public class Warehouse {

    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        if (order.getNumber() !=null) {
            orders.add(order);
        }
        System.out.println("Count of orders: " + orders.size());
    }


    public Order getOrder(String number) throws OrderDoesntExistException {

        Order order = orders
                .stream()
                .filter(r -> r.getNumber().equals(number))
                .findFirst().orElseThrow(()-> new OrderDoesntExistException());
        System.out.println("Order number: " + order);
        return order;
    }
   

}



/*
try {
        boolean getOrderTwenty = warehouse.getOrder("twenty");
        System.out.println("Order: " + getOrderTwenty);
        } catch (OrderDoesntExistException) {
        System.out.println("The order doesn't exist.");
        }



public Order getOrder(String number) throws OrderDoesntExistException {
        if (orders != null) {
        Order order = orders
        .stream()
        .filter(r -> r.getNumber().equals(number))
        .findFirst().get();
        System.out.println("Order number: " + order);
        return order;
        }
        throw new OrderDoesntExistException();
        }

 */