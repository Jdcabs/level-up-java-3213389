package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        double minimumCharge = 18.84;
        double waterGalloninCCF = 748;
        double minWithGallons = 2 * waterGalloninCCF;

        // if (gallonsUsage <= minWithGallons) {
        // return minimumCharge;
        // }

        double extraConsumedGallon = gallonsUsage - minWithGallons;
        double extraAmount = Math.ceil(extraConsumedGallon / waterGalloninCCF) * 3.9;
        System.out.println(Math.ceil(extraConsumedGallon / minWithGallons) * 3.9);
        System.out.println(extraAmount);
        
        return minimumCharge + extraAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
