package com.pluralsight.Vehicles;
/**
 * Simple program to test the instantiation of Vehicle's suclasses.
 *
 * @author Ravi Spigner
 */
public class Main {
    public static void main(String[] args) {
        Moped moped1 = new Moped("Honda ADV160", "Cherry Red");
        System.out.println(moped1);
        Car car1 = new Car("Toyota Camry", "Black");
        System.out.println(car1);
        SemiTruck semiTruck1 = new SemiTruck("Mack Anthem", "White");
        System.out.println(semiTruck1);
        Hovercraft hover1 = new Hovercraft("Neoteric Hovertrek 3497", "Deep Purple");
        System.out.println(hover1);
    }
}
