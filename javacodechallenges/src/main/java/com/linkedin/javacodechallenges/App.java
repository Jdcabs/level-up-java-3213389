package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {

        if (password.length() < 6) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length() || !hasUpperCase && !hasLowerCase
                && !hasNumber; i++) {
            char currentDigit = password.charAt(i);

            if (Character.isDigit(currentDigit)) {
                hasNumber = true;
            } else if (Character.isUpperCase(currentDigit)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(currentDigit)) {
                hasLowerCase = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
