package com.aldinrizvo.qamp.oophomework3.task2;

public class Car extends Vehicle {
    private final DieselEngine engine;

    public Car(final String model, final double capacity) {
        super(model);
        this.engine = new DieselEngine(capacity);
    }

    @Override
    public double accelerate(final double speed) {
        double resultingSpeed = this.getSpeed();

        if (engine.canAccelerate(speed)) {
            resultingSpeed = super.accelerate(speed);
            this.engine.decreaseCapacity(speed);
        }

        return resultingSpeed;
    }

    @Override
    public String toString() {
        return "vehicle: " + getModel() + ", speed: " + getSpeed() + ", capacity: " + engine.getCapacity();
    }
}
