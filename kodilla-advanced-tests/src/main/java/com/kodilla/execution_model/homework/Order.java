package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double price;
    private LocalDate orderDate;
    private String purchaserLogin;

    public Order(double price, LocalDate orderDate, String purchaserLogin) {
        this.price = price;
        this.orderDate = orderDate;
        this.purchaserLogin = purchaserLogin;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getPurchaserLogin() {
        return purchaserLogin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", orderDate=" + orderDate +
                ", purchaserLogin='" + purchaserLogin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 && Objects.equals(orderDate, order.orderDate) && Objects.equals(purchaserLogin, order.purchaserLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, orderDate, purchaserLogin);
    }
}
