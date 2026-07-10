package org.rrgames.physics.dynamics;

public final class Dynamics {

    private Dynamics() {}

    public static double calculateVelocity(double distance, double time) {
        if (time == 0) {
            throw new IllegalArgumentException("Time cannot be zero.");
        }
        return distance / time;
    }

    public static double calculateDistance(double velocity, double time) {
        return velocity * time;
    }

    public static double calculateTime(double distance, double velocity) {
        if (velocity == 0) {
            throw new IllegalArgumentException("Velocity cannot be zero.");
        }
        return distance / velocity;
    }

    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    public static double calculateMassFromMomentum(double momentum, double velocity) {
        if (velocity == 0) {
            throw new IllegalArgumentException("Velocity cannot be zero.");
        }
        return momentum / velocity;
    }

    public static double calculateVelocityFromMomentum(double momentum, double mass) {
        if (mass == 0) {
            throw new IllegalArgumentException("Mass cannot be zero.");
        }
        return momentum / mass;
    }
}