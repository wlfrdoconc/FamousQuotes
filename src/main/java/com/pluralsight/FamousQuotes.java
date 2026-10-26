package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        // Objective: Create an application that displays famous sayings or quotes

        // Create an array of strings that stores 10 quotes
        String[] quotes = {
                "Small habits lead to big changes.",
                "Focus on progress, not perfection.",
                "Every action shapes who you become.",
                "Consistency matters more than intensity.",
                "Success starts with daily improvement.",
                "Build systems, not just goals.",
                "Your habits shape your future.",
                "Make good habits easy to follow.",
                "Improve yourself one percent every day.",
                "Lasting change starts with small steps."
        };

        // Prompt the user to select a number from 1 to 10 and display that quote
        Scanner read = new Scanner(System.in);

        System.out.print("Pick a quote (select from #1 to #10): ");
        int enteredIndex = read.nextInt();

        enteredIndex--; // Change number from range 1-10 to 0-9

        // As long as the user entered a number in the range of 1-10 the program will work

        // Prints out the requested quote from the array
        System.out.println(quotes[enteredIndex]);
    }
}