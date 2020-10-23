package com.kodilla.basic_assertion.bank.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {


    @Test
    public void shouldCountWithdraws() {
        CashMachine cm1 = new CashMachine(), cm2 = new CashMachine();
        cm1.add(100);
        cm1.add(500);
        cm1.add(-300);
        cm1.add(-300);

        cm2.add(500);
        cm2.add(-60);

        Bank bank1 = new Bank();
        bank1.add(cm1);
        bank1.add(cm2);

        assertEquals(3,bank1.bankWithdrawCount());
        assertEquals(660,bank1.withdraw());
        assertEquals(220, bank1.withdrawAver());
        assertEquals(440, bank1.balance());

        assertEquals(1100, bank1.deposit());
        assertEquals(3, bank1.bankDepositCount());
        assertEquals(366.7, bank1.averDeposit(),0.1);



    }
}
