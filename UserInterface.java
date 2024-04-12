package com.tnsifDAY5;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        scanner.close();

        // Check if numbers are amicable
        NumberCategory amicableChecker = NumberCategoryUtility.checkAmicable();
        boolean areAmicable = amicableChecker.checkNumberCategory(number1, number2);

        
        NumberCategory palindromeChecker = NumberCategoryUtility.checkPalindrome();
        boolean isPalindrome = palindromeChecker.checkNumberCategory(number1, number2);

        // Display the result
        if (areAmicable) {
            System.out.println(number1 + " and " + number2 + " are amicable numbers");
        } else {
            System.out.println(number1 + " and " + number2 + " are not amicable numbers");
        }

        if (isPalindrome) {
            System.out.println("Their Product " + number1 * number2 + " produces a Palindrome");
        } else {
            System.out.println("Their Product " + number1 * number2 + " does not produce a Palindrome");
        }
    }
}

