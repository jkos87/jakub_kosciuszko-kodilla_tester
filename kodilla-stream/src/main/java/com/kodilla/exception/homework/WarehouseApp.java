package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("124"));
        warehouse.addOrder(new Order("125"));


        try {
            warehouse.getOrder("125");
            System.out.println("Order exist"); }
        catch (OrderDoesntExistException e){
            System.out.println("Order dosent exist");}
    }
}
