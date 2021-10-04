package com.company;

import java.util.Scanner;

public class JoseProgram {




    //==============================================================================

        //------------------------------------------------------------------------------
        private static final Scanner keyboard = new Scanner(System.in);
        private static final byte FEET_PER_ATMOSPHERE = 33;
        //------------------------------------------------------------------------------
        public static void main(String[] args) {
//---Variables to hold and account for
            Scanner scnr = new Scanner(System.in);
            double depth = scnr.nextDouble();
            double percentageO2 = scnr.nextDouble();
            double oxygen = scnr.nextDouble();
            double percentageNitrogen = (100 - percentageO2);
//---Calculations
            double ambientPressure = (depth / FEET_PER_ATMOSPHERE + 1);
            double partialOxygenDive = ((percentageO2 / 100) * ambientPressure);
        }
        //--------------------------------------------------------------------------------
        private static void OxygenGroups(double oxygen) {
//---Oxygen pressure group A
            if (oxygen > 0.0 && oxygen < 0.1) {
                System.out.println("A");
            } else if (oxygen > 0.1 && oxygen < 0.2) {
                System.out.println("B");
            } else if (oxygen > 0.2 && oxygen < 0.3) {
                System.out.println("C");
            }
//---Oxygen pressure group B
            if (oxygen > 0.1 && oxygen < 0.2) {
                System.out.println("B");
            } else if (oxygen > 0.0 && oxygen < 0.1) {
                System.out.println("A");
            } else if (oxygen > 0.2 && oxygen < 0.3) {
                System.out.println("C");
            }
//---Oxygen pressure group C
            if (oxygen > 0.2 && oxygen > 0.3) {
                System.out.println("C");
            } else if (oxygen > 0.0 && oxygen < 0.1) {
                System.out.println("A");
            } else if (oxygen > 0.1 && oxygen < 0.2) {
                System.out.println("B");
            }
//---Oxygen pressure group N
            if (oxygen > 0.4 && oxygen >= 0.6) {
                System.out.println("N");
            } else if (oxygen > 0.0 && oxygen < 0.1) {
                System.out.println("A");
            } else if (oxygen > 0.1 && oxygen < 0.2) {
                System.out.println("B");
            } else if (oxygen > 0.2 && oxygen < 0.3) {
                System.out.println("C");
            }
//---Final oxygen pressure statement
            if (oxygen >= 1.6) {
                System.out.println("Exceeds maximal O2 pressure" + ":" + "TRUE");
            } else {
                System.out.println("Exceeds contingency O2 pressure" + ":" + "FALSE");
            }
        }
    }



