package com.kodilla.exception.homework;

import junit.framework.AssertionFailedError;
import org.junit.Test;

import static org.junit.Assert.*;


public class WarehouseTestSuite {
    Warehouse warehouse = new Warehouse();

   @Test
public void checkGetOrder()  {
       OrderDoesntExistException exception = assertThrows{
           OrderDoesntExistException.class,
                   () -> {
                       return warehouse.getOrder("12"))
                   };
       }

    }

    @Test (expected = OrderDoesntExistException.class)
    public void checkGetOrder_withExepction() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("0"));
        //when
        Order order = warehouse.getOrder("5");
        //then
        assertEquals("0",order.getNumber());
    }
}