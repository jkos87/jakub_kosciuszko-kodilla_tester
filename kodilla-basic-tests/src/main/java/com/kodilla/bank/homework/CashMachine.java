package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transaction;
    private int size;


    public CashMachine() {
        this.size = 0;
        this.transaction = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transaction, 0, newTab, 0, transaction.length);
        newTab[this.size - 1] = value;
        this.transaction = newTab;

    }

    public int[] getAmount() {
        return transaction;
    } //zwaraca wartość wplaty

    public int getCount() {
        return this.size;
    } //zwraca ilość transakcji

    public int getCashMachineBalance() { //zwraca stan konta po transakcjach
        int sum = 0;
        for (int i = 0; i < transaction.length; i++) {
            sum = sum + this.transaction[i];
        }
        return sum;
    }

    public int getWithdraw() {
        int withdraw = 0;
        for (int i = 0; i < transaction.length; i++) {
            if (this.transaction[i] < 0)
                withdraw = (withdraw + this.transaction[i]);
        }
       return withdraw * (-1);
    }

    public int getCountWithdraw(){
        int count = 0;
        for (int i = 0; i < transaction.length; i++){
            if(this.transaction[i] < 0)
            count = count + 1;
        }
        return count;
    }

    public int getDeposit() {
        int deposit = 0;        //int count = 0 metoda liczenie
        for (int i = 0; i < transaction.length; i++) {
            if (this.transaction[i] > 0)
                deposit = (deposit + this.transaction[i]); //count++
        }
        return deposit;
    }
    public int getCountDeposit(){
        int count = 0;
        for (int i = 0; i < transaction.length; i++){
            if(this.transaction[i] > 0)
                count = count + 1;
        }
        return count;
    }


        /* public double getAvarage(){
            double sum = 0;
            for (int i = 0; i < this.transaction.length; i++) {
                sum += this.transaction[i];
            }
            return sum/this.transaction.length;
        }**/

}
