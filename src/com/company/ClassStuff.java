package com.company;
import java.util.Scanner;

public class ClassStuff {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Hello, ");
        askAQuestion();
    }
    private static void askAQuestion() {

        System.out.println("What is your name?");
        String name;
        name = keyboard.nextLine();
        System.out.println("Your name is " + name + ".");
    }
}
