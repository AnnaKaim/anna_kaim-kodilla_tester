package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("one"));
        warehouse.addOrder(new Order("two"));
        warehouse.addOrder(new Order("three"));
        warehouse.addOrder(new Order("four"));
        warehouse.addOrder(new Order("five"));
        warehouse.addOrder(new Order("six"));
        warehouse.addOrder(new Order("seven"));
        warehouse.addOrder(new Order("eight"));
        warehouse.addOrder(new Order("nine"));
        warehouse.addOrder(new Order("ten"));


        Order getOrderTwenty = null;
        try {
            getOrderTwenty = warehouse.getOrder("twenty");
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
            System.out.println("Order doesn't exist.");
        }
        System.out.println("Order status: " + getOrderTwenty);

    }
}


