package main;
import java.text.DecimalFormat;
import java.util.Scanner;

class Main{

    public static void main(String[] args){
        final int Months_in_year = 12;
        final int percentage = 100;

        Scanner reader = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = reader.nextInt();

        System.out.println("Annual Interest rate: ");
        float annualInterest = reader.nextFloat();

        float monthlyInterest = annualInterest/ percentage/Months_in_year;

        System.out.println("Period (years): ");
        int years = reader.nextInt();

        int numberOfPayments = years * Months_in_year;

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


        System.out.println(new DecimalFormat("$#.00").format(mortgage));
    }
}
