package com.anudip.assignment;

import java.util.Scanner;

public class StrongPassword {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("create  your password: ");
        String str = sc.nextLine();
        int length = str.length();
        int lowerCase = 0;
        int upperase = 0;
        int num = 0;
        int specialCase = 0;
        if (str.length() >= 8) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    lowerCase++;
                } else if (ch >= 'A' && ch <= 'Z') {
                    upperase++;
                } else if (ch >= '0' && ch <= '9') {
                    num++;
                } else {
                    specialCase++;
                }

            }
            if (lowerCase > 0 && upperase > 0 && num > 0 && specialCase > 0) {
                System.out.println("it is a strong password");
            } else {
                System.out.println("re-enter the password: ");
            }
        } else {
            System.out.println("Password must be 8 character: ");
        }
        int attempts = 0;
        boolean success = false;

        while (attempts < 3 && !success) {
            System.out.println("Enter your password: ");
            String userPassword = sc.nextLine();

            if (str.equals(userPassword)) {
                System.out.println("Login Successfully");
                success = true;
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Incorrect password. Try again (" + (3 - attempts) + " attempts left).");
                }
            }
        }

        if (!success) {
            System.out.println("System is locked");
        }

    }
}
