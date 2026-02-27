package main;

import java.text.DecimalFormat;
import java.util.Scanner;

class Main {

    static double Calculator() {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENTAGE = 100;

        Scanner reader = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = reader.nextInt();

        System.out.println("Annual Interest rate: ");
        float annualInterest = reader.nextFloat();

        double monthlyInterest = annualInterest / PERCENTAGE / MONTHS_IN_YEAR;

        System.out.println("Period (years): ");
        int years = reader.nextInt();

        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public static void main(String[] args) {
        double mortgage = Calculator();
        System.out.println("Your monthly mortgage is: " +
                new DecimalFormat("$#.00").format(mortgage));
    }
}
