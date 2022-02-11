package AlgorithmMadeUpExamples;

import java.util.*;

public class Question2 {

    // Java method to tell if the numbers are prime among themselves

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // By using scanner we are recieving the numbers then using method
        System.out.println("Please enter two numbers to check if they are prime among themselves: ");
        int number1 = scan.nextInt(), number2 = scan.nextInt();

        System.out.println(arePrime(number1, number2));

    }

    // Declaring method
    public static String arePrime(int number1, int number2){

        // Declaring a varaible to hold lower value number to use while checking the divisions
        // Also declaring a key to change to process by the conditions
        int testRange;
        boolean key = true;

        // Deciding which number has the lower value and holding inside "testRange" varaible
        if(number1 < number2) {

            testRange = number1;

        } else {

            testRange = number2;

        }

        // For loop to reach every each number to divide our numbers and see if they are prime among themselves
        for(int i=2; i<=testRange; i++) {

            // If they can be divided the same number we set the key false and break the loop
            if(number1 %i == 0 && number2 %i == 0) {

                key = false;
                break;

            }

        }

        // If one of numbers is 0 or 1 they wont be prime so we are checking that
        if(number1 == 1 || number1 == 0 || number2 == 1 || number2 == 0) {

            return "These numbers are not prime among themselves";

        // By the key we are sending prime or not prime message
        } else if(key) {

            return "These numbers are prime among themselves";

        } else {

            return "These numbers are not prime among themselves";

        }

    }

}
