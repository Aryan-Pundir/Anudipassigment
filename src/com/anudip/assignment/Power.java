package com.anudip.assignment;

import java.util.Scanner;

public class Power {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int x = sc.nextInt();
        double m = Math.pow(n,x);
        System.out.println(m);
        int result = 1;
        for ( int i = 1; i<=x;i++){
            result *=n;
        }
        System.out.println(result);
    }
}
