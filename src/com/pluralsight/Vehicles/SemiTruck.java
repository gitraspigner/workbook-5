package com.pluralsight.Vehicles;
/**
 * Simple class representing a Semi Truck with properties of a Vehicle.
 *
 * @author Ravi Spigner
 */
public class SemiTruck extends Vehicle {
    public SemiTruck(String model, String color, int numberOfPassengers,
                      int cargoCapacity, int fuelCapacity) {
        super(model, "Semi Truck", color, numberOfPassengers, cargoCapacity, fuelCapacity, 18);
    }
    public SemiTruck(String model, String color) {
        super(model, "Semi Truck", color, 3, 30, 25, 18);
    }
}
