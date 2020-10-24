package com.kodilla.basic_assertion.bank.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    CashMachine cm1 = new CashMachine(), cm2 = new CashMachine();
    Bank bank1 = new Bank();

    @Test
    public void shouldCountWithdraws() {
        cm1.add(-300);
        cm1.add(-300);
        cm2.add(-60);

        bank1.add(cm1);
        bank1.add(cm2);
        assertEquals(3, bank1.bankWithdrawCount()); // ilość wypłat
    }

    @Test
    public void shoudlGetAmountWithdraw() {
        cm1.add(-100);
        cm2.add(-200);

        bank1.add(cm1);
        bank1.add(cm2);

        assertEquals(300, bank1.withdraw());
    }

    @Test
    public void shouldGetWithdrawAverage() {
        cm1.add(-300);
        cm2.add(-100);

        bank1.add(cm1);
        bank1.add(cm2);

        assertEquals(200, bank1.withdrawAver());
    }

    @Test
    public void shouldGetAmountDeposit() {
        cm1.add(300);
        cm2.add(100);

        bank1.add(cm1);
        bank1.add(cm2);

        assertEquals(400, bank1.deposit());
    }

    @Test
    public void shouldGetDepositAverage() {
        cm1.add(300);
        cm2.add(500);

        bank1.add(cm1);
        bank1.add(cm2);

        assertEquals(400, bank1.averDeposit());
    }

    @Test
    public void shouldCountDeposit() {
        cm1.add(300);
        cm2.add(500);
        cm2.add(100);

        bank1.add(cm1);
        bank1.add(cm2);

        assertEquals(3, bank1.bankDepositCount());
    }

}

