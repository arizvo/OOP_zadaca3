package com.aldinrizvo.qamp.oophomework3.task2;

public class DieselEngine extends Engine {
    public DieselEngine(final double capacity) {
        super(capacity);
    }

    @Override
    public double decreaseCapacity(final double speed) {
        this.setCapacity(this.getCapacity() - 0.2 * speed);;
        return this.getCapacity();
    }

    public boolean canAccelerate(final double speed) {
        return this.getCapacity() >= 0.2 * speed;
    }
}
