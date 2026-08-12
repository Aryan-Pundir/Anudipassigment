package com.anudip.assignment;

import java.util.Scanner;

public class DigitCounter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while (temp!=0){
         count++;
         int m = temp%10;
         temp = temp/10;
        }
        System.out.println("count is " + count);
    }
}
