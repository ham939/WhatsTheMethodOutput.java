package com.company;
import java.util.Scanner;

public class i95 {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double distance;
        double time = 0;

        boolean over = false;

//----Output the welcome message and instructions.

        System.out.println("Welcome to the I95 Speed Machine\n\n");
        System.out.println("You will have to supply:");
        System.out.println("+ The distance you want to travel, in miles");
        System.out.println("+ The time you have available, in hours\n");

//----Prompt the User to enter the parameters.
        System.out.print("Enter distance to travel : ");
        distance = keyboard.nextDouble();
        System.out.print("Enter time available     : ");
        time = keyboard.nextDouble();



//----Calculate if the speed is above limit.
        if (travelSpeed(distance, time) > 65)
            over = true;

//----Output the computed values.
        System.out.println("\nYou will have to travel at " + travelSpeed(distance, time) +"mph");
        System.out.println("Over the speed limit     : " + over);
        System.out.println("");
    }

//----Compute the travel speed.
    private static double travelSpeed(final double distance, final double time) {

        double travelSpeed, extraTime;

        extraTime =  ( (int)(distance / 100) + 1) * (5.0 / 60);
        travelSpeed = distance / (time - extraTime);
        return travelSpeed;
    }
}
