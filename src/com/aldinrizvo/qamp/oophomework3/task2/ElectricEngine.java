package com.aldinrizvo.qamp.oophomework3.task2;

public class ElectricEngine extends Engine {

    public ElectricEngine(final double capacity) {
        super(capacity);
    }

    public void brake(final double brakeSpeed) {
        super.increaseCapacity(0.1 * brakeSpeed);
    }
}
