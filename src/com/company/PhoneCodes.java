package com.company;
import java.util.Scanner;

public class PhoneCodes {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int input = getNumber();

//----Output the encoded number.
        System.out.println("The phone number 305" + input + " can be encoded as " +
                            (encode(305, 3)) + (encode(input, 7)));
    }

//----Keep prompting the user until a valid number is input.
    private static int getNumber() {

        int input;

        do {
            System.out.print("Please enter your 305 phone number: ");
            input = keyboard.nextInt();
        }   while (input <= 999999);

        return input;
    }

//----Encode the number.
    private static String encode(int number, int loop) {

        int i = 0, random, digit, number1, divisor = (int)Math.pow(10, loop - 1);
        String encoded = "";

//----Store the possible characters for each number in a predefined array.
        char[][] letters = {{'0'},
                            {'1'},
                            {'A', 'B', 'C'},
                            {'D', 'E', 'F'},
                            {'G', 'H', 'I'},
                            {'J', 'K', 'L'},
                            {'M', 'N', 'O'},
                            {'P', 'Q', 'R', 'S'},
                            {'T', 'U', 'V'},
                            {'W', 'X', 'Y', 'Z'}};

        int[] numLetters = {1, 1, 3, 3, 3, 3, 3, 4, 3, 4};

        while (i <= loop - 1) {
            digit = number / divisor;
            number %= divisor;
            divisor /= 10;

            random = (int)(Math.random() * numLetters[digit]);
            i += 1;

            encoded = (encoded + letters[digit][random]);
        }

        return encoded;
    }
}
