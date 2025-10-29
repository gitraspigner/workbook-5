package com.pluralsight.AssetManager;

/**
 * Represents Cash, which is one of the most basic forms of an Asset.
 * Cash has a description (to provide context for it such as: Paycheck or Gift)
 * a date it was acquired, and (here originalCost represents) its monetary value.
 *
 * @author Ravi Spigner
 */
public class Cash extends Asset {
    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }
    @Override
    public double getValue() {
        return super.getOriginalCost();
    }
}
