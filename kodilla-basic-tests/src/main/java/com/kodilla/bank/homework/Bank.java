package com.kodilla.bank.homework;

public class Bank {
    private int atmNr;
    private CashMachine[] atm;
    private CashMachine deposit;
    private CashMachine withdraw;


    public Bank(int atmNr){
        this.atmNr = atmNr;
        this.deposit = new CashMachine();
        this.withdraw = new CashMachine();
    }
    public void addDeposit(int value){
        if (value >0){
            this.deposit.add(value);
        }
    }
    public void subWithdraw(int value){
        if (value<0){
            this.withdraw.add(value);
        }
    }

    public int getaddDeposit(){
        return this.deposit.getCount();
    }
    public int getsubWithdraw(){
        return this.withdraw.getCount();
    }
}
