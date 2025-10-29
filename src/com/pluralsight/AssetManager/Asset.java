package com.pluralsight.AssetManager;
/**
 * An Asset contains information such as a brief description of the asset,
 * the date it was acquired, and the original monetary cost of it (in dollars).
 *
 * @author Ravi Spigner
 */
public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }
    public double getValue() {
        return originalCost; //although is redundant to getOriginalCost()
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDateAcquired() {
        return dateAcquired;
    }
    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }
    public double getOriginalCost() {
        return originalCost;
    }
    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }
}
