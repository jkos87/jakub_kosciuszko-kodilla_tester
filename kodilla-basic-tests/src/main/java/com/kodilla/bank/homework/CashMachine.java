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
        public int[] getAmmount() {
            return transaction;
        } //zwaraca wartość wplaty

        public int getCount(){
            return this.size;
        } //zwraca ilość transakcji

        public int getBalance(){ //zwraca stan konta po transakcjach
        int sum = 0;
        for (int i=0; i<transaction.length;i++){
             sum = sum + this.transaction[i];
        }
        return sum;
        }


}
