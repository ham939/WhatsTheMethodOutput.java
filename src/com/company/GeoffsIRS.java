package com.company;
import java.util.Scanner;

public class GeoffsIRS {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String args[] ) {

        double input = 0, deduction = 0 , income = 0;
        double taxable;

//----Input income and deduction.
        do {
            System.out.print("Enter next amount : ");
            input = keyboard.nextInt();
            if (input > 0) {
                income  += input;
            }
            else if (input < 0) {
                deduction = deduction - input;
            }
        } while (input != 0);
        System.out.println();

//----Compute taxable income.
        if (income >= deduction) {
            taxable = income - deduction;
        }
        else {
            taxable = 0.0;
        }

//----Display tax information.
        System.out.println("Income         = $" + income);
        System.out.println("Deductions     = $" + deduction);
        System.out.println("Taxable income = $" + taxable);
        System.out.println("Tax group      = " + group(taxable));
        if (tax(group(taxable), taxable) != -1) {
            System.out.println("Tax owed       = $" + tax(group(taxable), taxable));
        }
        else {
            System.out.println("Error!");
        }
    }

//----Compute tax group.
    private static char group(double taxable) {

        char group;

        if (taxable >= 500000) {
            group = 'S';
        }
        else if (taxable >= 200000) {
            group = 'Q';
        }
        else if (taxable >= 100000) {
            group = 'M';
        }
        else if (taxable >= 50000) {
            group = 'A';
        }
        else if (taxable >= 20000) {
            group = 'R';
        }
        else {
            group = 'P';
        }
        return group;
    }

//----Compute tax.
    private static double tax(char group, double taxable) {
        double tax = 0;
        switch (group) {
            case 'S':
                tax = 0.25 * taxable;
                break;

            case 'Q':
                tax = 0.25 * taxable;
                break;

            case 'M':
                tax = 0.1 * taxable;
                break;

            case 'A':
                tax = 0.03 * taxable;
                break;

            case 'R':
                tax = 0.03 * taxable;
                break;

            case 'P':
                tax = 0.0 * taxable;
                break;

            default:
                tax = -1;
                break;
        }
        return tax;
    }

}
