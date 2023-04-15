package com.aldinrizvo.qamp.oophomework3.task2;

public class ElectricCar extends Vehicle {
    private final ElectricEngine engine;

    public ElectricCar(final String model, final double capacity) {
        super(model);
        this.engine = new ElectricEngine(capacity);
    }

    @Override
    public double accelerate(final double speed) {
        double resultingSpeed = this.getSpeed();

        if (this.engine.getCapacity() >= 0.4 * speed) {
            resultingSpeed = super.accelerate(speed);
            this.engine.decreaseCapacity(0.4 * speed);
        }

        return resultingSpeed;
    }

    @Override
    public double decelerate(final double speed) {
        final double currentSpeed = this.getSpeed();
        final double resultingSpeed;

        if (currentSpeed - speed <= 0) {
            resultingSpeed = super.decelerate(currentSpeed);
            this.engine.brake(currentSpeed);
        } else {
            resultingSpeed = super.decelerate(speed);
            this.engine.brake(speed);
        }

        return resultingSpeed;
    }

    @Override
    public String toString() {
        return "vehicle: " + getModel() + ", speed: " + getSpeed() + ", capacity: " + engine.getCapacity();
    }
}
