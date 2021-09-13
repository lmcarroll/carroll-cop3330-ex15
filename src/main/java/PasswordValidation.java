
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "COP3330";

        System.out.println("What is the password?");
        Scanner input = new Scanner(System.in);
        String attempt = input.nextLine();

        if (attempt.equals(password)) {
            System.out.println("Welcome!");
        } else
            System.out.println("I don't know you.");


    }
}
