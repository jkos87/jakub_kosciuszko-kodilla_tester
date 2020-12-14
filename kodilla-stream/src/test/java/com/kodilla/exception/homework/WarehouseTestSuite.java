package com.kodilla.exception.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WarehouseTestSuite {
    Warehouse warehouse = new Warehouse();

   @Test
public void checkGetOrder_withException()  {
       Assertions.assertThrows(OrderDoesntExistException.class,
            () -> warehouse.getOrder("12"));

    }

    @Test
    public void checkGetOrder() throws OrderDoesntExistException {
        // given
        warehouse.addOrder(new Order("0"));
        //when
        Order order = warehouse.getOrder("0");
        //then
        assertEquals("0",order.getNumber());
    }
}