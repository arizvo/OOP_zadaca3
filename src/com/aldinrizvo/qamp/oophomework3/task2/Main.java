package com.aldinrizvo.qamp.oophomework3.task2;

public class Main {
    public static void main(String[] args) {
        Vehicle tractor = new Vehicle("IMT 533");
        Car volkswagen = new Car("Golf 2", 40);
        ElectricCar rimac = new ElectricCar("Nevera", 200);

        System.out.println(tractor);
        System.out.println(volkswagen);
        System.out.println(rimac);

        System.out.println("\nAll cars accelerate by 40 units: ");

        tractor.accelerate(40);
        volkswagen.accelerate(40);
        rimac.accelerate(40);

        System.out.println(tractor);
        System.out.println(volkswagen);
        System.out.println(rimac);

        System.out.println("\nAll cars decelerate (by 10, 10, 50 units): ");

        tractor.decelerate(10);
        volkswagen.decelerate(10);
        rimac.decelerate(50);

        System.out.println(tractor);
        System.out.println(volkswagen);
        System.out.println(rimac);
    }
}
