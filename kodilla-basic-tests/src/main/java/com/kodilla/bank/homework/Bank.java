package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] atms;
    private int size;

    public Bank() {
        this.atms = new CashMachine[0];
        this.size = 0;
    }
    public void add(CashMachine atm) { //typ CashM nazwa dowolna
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(atms, 0, newTab, 0, atms.length);
        newTab[this.size - 1] = atm;
        this.atms = newTab;
    }

    public double balance() { //blians ze wszystkich bankomatow
        int sum = 0;
        for (int i = 0; i < this.size; i++)//moze byc tez po size bo jest int
            sum = sum + this.atms[i].getCashMachineBalance();
        return sum;
    }
    public double deposit() {
        int sum = 0;
        for (int i=0; i<this.size; i++)
            sum+= this.atms[i].getDeposit();
        return sum;
    }

    public double bankDepositCount(){
        int sum = 0;
        for (int i = 0; i<this.size; i++)
            sum+= this.atms[i].getCountDeposit();
           return sum;
    }

    /* public double depositAver() {
        int sum=0;
        for (int i = 0; i<this.size; i++)
            sum+=
    }*/

    public double withdraw() {
        int sum = 0;
        for (int i = 0; i < this.size; i++)//moze byc tez po size bo jest int
            sum = sum + this.atms[i].getWithdraw();
        return sum;
    }

    public int bankWithdrawCount() {
        int sum = 0;
        for (int i = 0; i < this.size; i++)
            sum = sum + this.atms[i].getCountWithdraw();
        return sum;
    }

    public double withdrawAver() {
        double sum = 0;
        for (int i = 0; i < this.size; i++)//moze byc tez po size bo jest int
            sum = sum + this.atms[i].getWithdraw();

        return sum/bankWithdrawCount();
    }
    public double averDeposit() {
        double sum = deposit()/bankDepositCount();
        return sum;
    }
}

