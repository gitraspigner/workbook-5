package com.pluralsight.AssetManager;
import java.time.LocalDate;

/**
 * Represents a Vehicle (which is an Asset) and contains information such as its make/model,
 * the year it was produced, and its odometer reading.
 * Can retrieve the current monetary value of the vehicle (in dollars) which is dependent on
 * the years elapsed from its production date and its make/model.
 *
 * @author Ravi Spigner
 */
public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    @Override
    public double getValue() {
        int currentAge = year - LocalDate.now().getYear();
        double carValue = super.getOriginalCost();
        if (currentAge <= 3) {
            carValue = carValue - 0.03 * getOriginalCost() * currentAge;
        } else if (currentAge <= 6) {
            carValue = carValue - 0.06 * getOriginalCost() * currentAge;
        } else if (currentAge <= 10) {
            carValue = carValue - 0.08 * getOriginalCost() * currentAge;
        } else {
            carValue = 1000;
        }
        if (odometer > 100_000
                //conditions below are specific from the exercise writeup for this java class
                && !makeModel.toLowerCase().contains("honda")
                && !makeModel.toLowerCase().contains("toyota")) {
            carValue *= 0.75;
        }
        return carValue;
    }
    public String getMakeModel() {
        return makeModel;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getOdometer() {
        return odometer;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
