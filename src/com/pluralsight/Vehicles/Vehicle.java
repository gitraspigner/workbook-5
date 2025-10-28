package com.pluralsight.Vehicles;
/**
 * Simple class representing a Vehicle with some properties of a vehicle.
 * (Used to demonstrate basic inheritance)
 *
 * @author Ravi Spigner
 */
public class Vehicle {
    private String model;
    private String vehicleType;
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private int numberOfWheels;
    public Vehicle(String model, String vehicleType, String color, int numberOfPassengers,
                   int cargoCapacity, int fuelCapacity, int numberOfWheels) {
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.numberOfWheels = numberOfWheels;
    }
    @Override
    public String toString() {
        return "Vehicle Type: " + vehicleType +
                " | Model: " + model +
                " | Color: " + color +
                " | Number of Passengers: " + numberOfPassengers +
                " | Cargo Capacity: " + cargoCapacity +
                " | Fuel Capacity: " + fuelCapacity +
                " | Number of Wheels: " + numberOfWheels;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    public int getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
