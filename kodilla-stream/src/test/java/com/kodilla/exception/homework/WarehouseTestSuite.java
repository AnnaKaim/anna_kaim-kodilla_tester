package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("one"));
        //when
        Order getFirstOrder = warehouse.getOrder("one");
        //then
        assertEquals("one", getFirstOrder.getNumber());
    }

    @Test
    public void testGetOrder_withException() {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("twenty"));
    }
}
