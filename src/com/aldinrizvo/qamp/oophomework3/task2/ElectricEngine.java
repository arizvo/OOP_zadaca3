package com.aldinrizvo.qamp.oophomework3.task2;

public class ElectricEngine extends Engine {

    public ElectricEngine(final double capacity) {
        super(capacity);
    }

    public void brake(final double brakeSpeed) {
        super.increaseCapacity(0.1 * brakeSpeed);
    }

    @Override
    public double decreaseCapacity(final double speed) {
        this.setCapacity(this.getCapacity() - 0.4 * speed);;
        return this.getCapacity();
    }

    public boolean canAccelerate(final double speed) {
        return this.getCapacity() >= 0.4 * speed;
    }
}
