package com.pluralsight.Vehicles;
/**
 * Simple class representing a Moped with properties of a Vehicle.
 *
 * @author Ravi Spigner
 */
public class Moped extends Vehicle {
    public Moped(String model, String color, int numberOfPassengers,
               int cargoCapacity, int fuelCapacity) {
        super(model, "Moped", color, numberOfPassengers, cargoCapacity, fuelCapacity, 2);
    }
    public Moped(String model, String color) {
        super(model, "Moped", color, 1, 1, 5, 2);
    }
}
