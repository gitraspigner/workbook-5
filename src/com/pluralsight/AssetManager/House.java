package com.pluralsight.AssetManager;
/**
 * Represents a House (which is an Asset) and contains information such as its address,
 * the condition of the house, its square footage, and the size of the lot.
 * Can retrieve the current monetary value of the house (in dollars) which is dependent on
 * its condition, square footage, and lot size.
 *
 * @author Ravi Spigner
 */
public class House extends Asset{
    private String address;
    private int condition; //1-4 (1 -excellent, 2 -good, 3 -fair, 4 -poor)
    private int squareFoot;
    private int lotSize;
    public House(String description, String dateAcquired, double originalCost, String address,
                 int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    public double getValue() {
        switch (condition) {
            case 1: //excellent
                return squareFoot*180.00 + lotSize*0.25;
            case 2: //good
                return squareFoot*130.00 + lotSize*0.25;
            case 4: //poor
                return squareFoot*80.00 + lotSize*0.25;
            default: //fair, also works if condition is 3
                return squareFoot*90.00 + lotSize*0.25;
        }
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getCondition() {
        return condition;
    }
    public void setCondition(int condition) {
        this.condition = condition;
    }
    public int getSquareFoot() {
        return squareFoot;
    }
    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }
    public int getLotSize() {
        return lotSize;
    }
    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
