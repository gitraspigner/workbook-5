package com.pluralsight.Vehicles;
/**
 * Simple class representing a Hovercraft with properties of a Vehicle.
 *
 * @author Ravi Spigner
 */
public class Hovercraft extends Vehicle {
    public Hovercraft(String model, String color, int numberOfPassengers,
                 int cargoCapacity, int fuelCapacity) {
        super(model, "Hovercraft", color, numberOfPassengers, cargoCapacity, fuelCapacity, 0);
    }
    public Hovercraft(String model, String color) {
        super(model, "Hovercraft", color, 4, 4, 8, 0);
    }
}
