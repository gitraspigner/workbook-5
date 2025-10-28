package com.pluralsight.Vehicles;
/**
 * Simple class representing a Car with properties of a Vehicle.
 *
 * @author Ravi Spigner
 */
public class Car extends Vehicle {
    public Car(String model, String color, int numberOfPassengers,
               int cargoCapacity, int fuelCapacity) {
        super(model, "Car", color, numberOfPassengers, cargoCapacity, fuelCapacity, 4);
    }
    public Car(String model, String color) {
        super(model, "Car", color, 5, 4, 10, 4);

    }
}
