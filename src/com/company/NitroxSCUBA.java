package com.company;
import java.util.Scanner;

public class NitroxSCUBA {

    private static final Scanner keyboard = new Scanner(System.in);

//----Declare the Constant for "feet per atmosphere."
    public static final int FEET_PER_ATMOSPHERE = 33;

    public static void main(String[] args) {

        int depth;
        int o2Percent;
        double pressure;

//----Input the Variables.
        System.out.print("Enter depth and percentage O2   : ");
        depth = keyboard.nextInt();
        o2Percent = keyboard.nextInt();

        pressure = partialPressure(o2Percent, ambientPressure(depth));

//----Output the Values.
        System.out.println();
        System.out.println("Ambient pressure                : " + ambientPressure(depth));
        System.out.println("O2 pressure                     : " + pressure);
        System.out.println("O2 group                        : " + o2Group(pressure));
        System.out.println();
        contAndPartialPressure(pressure);
    }

//----Calculate the Ambient Pressure.
    private static double ambientPressure(int depth) {
        double pressure;
        pressure = depth / FEET_PER_ATMOSPHERE + 1;
        return pressure;
    }

//----Calculate the Partial Pressure.
    private static double partialPressure(double o2Percent, double ambientPressure) {
        double pressure;
        pressure = (o2Percent / 100) * ambientPressure;
        return pressure;
    }

//----Figure out the Group.
    private static char o2Group(double partialPressure) {
        char group = 'A';
        group = (char)((int)(partialPressure * 10) + (int)'A');
/*      if (partialPressure >= 0.0 && partialPressure < 0.1) {
            group = 'A';
        }
        else if (partialPressure < 0.2) {
            group = 'B';
        }
        else if (partialPressure < 0.3) {
            group = 'C';
        }
        else if (partialPressure < 0.4) {
            group = 'D';
        }
        else if (partialPressure < 0.5) {
            group = 'E';
        }
        else if (partialPressure < 0.6) {
            group = 'F';
        }
        else if (partialPressure < 0.7) {
            group = 'G';
        }
        else if (partialPressure < 0.8) {
            group = 'H';
        }
        else if (partialPressure < 0.9) {
            group = 'I';
        }
        else if (partialPressure < 1.0) {
            group = 'J';
        }
        else if (partialPressure < 1.1) {
            group = 'K';
        }
        else if (partialPressure < 1.2) {
            group = 'L';
        }
        else if (partialPressure < 1.3) {
            group = 'M';
        }
        else if (partialPressure < 1.4) {
            group = 'N';
        }
        else if (partialPressure < 1.5) {
            group = 'O';
        }
        else if (partialPressure < 1.6) {
            group = 'P';
        }
        else {
            group = 'Q';
        }
 */
        return group;
    }

//----Compute and output the boolean values for exceeding the limits.
    private static void contAndPartialPressure(double pressure) {

        boolean maxO2Pressure;
        boolean contO2Pressure;

        if (pressure < 1.4) {
            maxO2Pressure = false;
            contO2Pressure = false;
        }
        else if (pressure < 1.6) {
            maxO2Pressure = true;
            contO2Pressure = false;
        }
        else {
            maxO2Pressure = true;
            contO2Pressure = true;
        }
        System.out.println("Exceeds maximal O2 pressure     : " + maxO2Pressure);
        System.out.println("Exceeds contingency O2 pressure : " + contO2Pressure);
    }

}


