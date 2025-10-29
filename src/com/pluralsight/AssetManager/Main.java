package com.pluralsight.AssetManager;
import java.util.ArrayList;
import java.util.List;
/**
 * *******Add program description here******
 *
 * @author Ravi Spigner
 */
public class Main {
    public static void main(String[] args) {
        List<Asset> assets = getAssets();
        System.out.println("----Assets Stored:----");
        for(Asset a : assets) {
            System.out.print("Asset: " + a.getDescription() + " | Original Value: $" +
                    a.getOriginalCost() + " | Current Value: $" + a.getValue() + " | ");
            if (a instanceof House h) {
                System.out.println("Address: " + h.getAddress());
            } else if (a instanceof Vehicle v) {
                System.out.println("Odometer Reading: " + v.getOdometer());
            } else if (a instanceof Cash c) {
                System.out.println();
            }
        }
    }
    private static List<Asset> getAssets() {
        List<Asset> assets = new ArrayList<>();
        House h1 = new House("Main House", "08/27/2000", 500_000,
                "1101 Easy Street", 1, 18_000, 100);
        House h2 = new House("Vacation House", "06/16/2010", 300_000,
                "1234 Hard Blvd", 1, 10_000, 50);
        Vehicle v1 = new Vehicle("Personal Car", "yesterday", 10_000,
                "Toyota Prius", 2016, 15_998);
        Vehicle v2 = new Vehicle("Family/Shared Car", "yesterday", 18_000,
                "PT Cruiser", 2022, 7_222);
        Cash c1 = new Cash("Monthly Pay", "10/10/2011", 3_000);
        Cash c2 = new Cash("Gift From Grandma", "12/25/2011", 100);
        assets.add(h1);
        assets.add(h2);
        assets.add(v1);
        assets.add(v2);
        assets.add(c1);
        assets.add(c2);
        return assets;
    }
}
