package com.kodilla.inheritance.homework;

public class AppOperatingSys {
    public static void main(String[] args){
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOnOffice();
        operatingSystem.turnOffOffice();

        Windows10 windows10 = new Windows10(2018);
        windows10.turnOnOffice();
        windows10.turnOffOffice();

        Windows2021 windows2021 = new Windows2021(2021);
        windows2021.turnOnOffice();
        windows2021.turnOffOffice();

    }
}
