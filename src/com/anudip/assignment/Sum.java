package com.anudip.assignment;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value:");
        int a = sc.nextInt();
        System.out.println("enter your second number:");
        int b = sc.nextInt();
        System.out.println("sum : " + a+b);
        System.out.println("sum " + (a+b));
    }
}
