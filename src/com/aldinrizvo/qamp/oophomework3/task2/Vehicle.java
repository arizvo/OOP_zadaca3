package com.aldinrizvo.qamp.oophomework3.task2;

public class Vehicle {
    private double speed;
    private String model;

    public Vehicle(final String model) {
        this.model = model;
        this.speed = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(final double speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public double accelerate(final double speed) {
        this.speed += speed;
        return this.speed;
    }

    public double decelerate(final double speed) {
        this.speed -= speed;

        if (this.speed < 0) {
            this.speed = 0;
        }

        return this.speed;
    }

    @Override
    public String toString() {
        return "vehicle: " + model + ", speed: " + speed;
    }
}
