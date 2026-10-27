package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String[] quotes = new String[10];

        quotes[0] = "Hello";
        quotes[1] = "Java";
        quotes[2] = "Amazing";
        quotes[3] = "Beautiful";
        quotes[4] = "Smart";
        quotes[5] = "Curly hair";
        quotes[6] = "Pizza";
        quotes[7] = "YUU";
        quotes[8] = "Smile";
        quotes[9] = "Holy";

        System.out.print("Pick a number between 1 -10 to reveal a quote: ");
        int input = myScanner.nextInt();
        input--;

        System.out.println(quotes[input]);

    }

}
