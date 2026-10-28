package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();
        int input = 0;
        char answer = 'y';


        ArrayList<String> quotes = new ArrayList<>(Arrays.asList(
                "1. Always bear in mind that your own resolution to succeed is more important than any other one thing.— Abraham Lincoln",
                "2. Far better it is to dare mighty things, to win glorious triumphs, even though checkered by failure… — Theodore Roosevelt",
                "3. Difficulties break some men but make others. — Nelson Mandela",
                "4. You gain strength, courage, and confidence by every experience in which you really stop to look fear in the face.— Eleanor Roosevelt",
                "5. You may encounter many defeats, but you must not be defeated. — Maya Angelou",
                "6. The credit belongs to the man who is actually in the arena… — Theodore Roosevelt",
                "7. Leave nothing for tomorrow which can be done today. — Abraham Lincoln",
                "8. I like friends who have independent minds because they tend to make you see problems from all angles. — Nelson Mandela",
                "9. Let none falter, who thinks he is right, and we may succeed. — Abraham Lincoln",
                "10. I wish to preach, not the doctrine of ignoble ease, but the doctrine of the strenuous life… — Theodore Roosevelt"
        ));

        try {
            do {
                if (answer == 'y') {
                    try {
                        System.out.print("Pick a number between 1 - 10 to reveal a quote (Enter 0 for a random quote): ");
                        input = myScanner.nextInt();

                        if (input == 0){
                            System.out.print("Looking for random quote...\n");
                            int random = rand.nextInt(10) + 1;
                            System.out.print(quotes.get(random));

                        } else {
                            int index = input - 1;
                            System.out.print(quotes.get(index));
                        }

                        System.out.print("\nWould you like to see another saying? ");
                        answer = myScanner.next().toLowerCase().charAt(0);

                    } catch (Exception e) {
                        System.out.print("Your input was out of range!\n");
                    }
                } else {
                    System.out.print("Try again: ");
                    answer = myScanner.next().toLowerCase().charAt(0);
                }
            } while (answer != 'n');

            System.out.print("Thank you!");
        } catch (Exception e) {
            System.out.print("Your input was invalid!\n");
        }
    }
}

        
        
        
        
        




