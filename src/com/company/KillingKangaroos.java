package com.company;
import java.util.Scanner;

public class KillingKangaroos {
    private static final Scanner keyboard = new Scanner(System.in);


//----The gas constant in Joule/mole/K.
    private static final double ROAD_KILL_CONSTANT = 1.47;

//----Initialize all the Variables.
    public static void main(String[] args) {
        double sideLength;
        double roadLength;
        int roos;
        double expKills;

//----Input the parameters from the user.
        System.out.print("Enter side of square in km  : ");
        sideLength = keyboard.nextDouble();
        System.out.print("Enter roads length in km    : ");
        roadLength = keyboard.nextDouble();
        System.out.print("Enter number of 'roos       : ");
        roos = keyboard.nextInt();

//--- Calculate expected no. of kills.
        expKills = (roos/(sideLength * sideLength * roadLength)) * ROAD_KILL_CONSTANT;

//----Output the value.
        System.out.print("Expected number of kills is : " + expKills);

    }
}
