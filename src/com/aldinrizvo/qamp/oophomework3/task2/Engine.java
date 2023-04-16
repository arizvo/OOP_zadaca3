package com.aldinrizvo.qamp.oophomework3.task2;

public class Engine {
    private double capacity;

    public Engine(final double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(final double capacity) {
        this.capacity = capacity;
    }

    public double increaseCapacity(final double addedCapacity) {
        this.capacity += addedCapacity;
        return this.capacity;
    }

    public double decreaseCapacity(final double speed) {
        this.capacity -= 0.2 * speed;
        return this.capacity;
    }

    @Override
    public String toString() {
        return "capacity: " + capacity;
    }
}
