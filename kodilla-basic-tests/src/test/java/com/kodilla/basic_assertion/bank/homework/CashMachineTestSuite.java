package com.kodilla.basic_assertion.bank.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    private CashMachine transaction1 = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {

        int[] transaction = transaction1.getAmmount();
        assertEquals(0, transaction.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {

        transaction1 .add(400);
        transaction1 .add(-200);


        int[] transaction = transaction1 .getAmmount();
        assertEquals(2, transaction.length);
        assertEquals(400, transaction[0]);
        assertEquals(-200, transaction[1]);
    }
    @Test
    public void shouldBalance(){

        transaction1.add(400);
        transaction1.add(-250);

        assertEquals(150,transaction1.getBalance(),0.01);
    }
    @Test
    public void shouldReturnCount(){
        transaction1.add(12);
        transaction1.add(22);

        assertEquals(2,transaction1.getCount());
    }
}
