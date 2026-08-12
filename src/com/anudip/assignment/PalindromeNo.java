package com.anudip.assignment;

import java.util.Scanner;

public class PalindromeNo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int reverse = 0;
        for(int temp = n; temp>0;temp/=10){
            int m = temp%10;
            reverse = reverse*10+m;
        }
        System.out.println(reverse);
        if (n==reverse){
            System.out.println("it is is a palidorme Number");
        }else {
            System.out.println("it is not a palidorme number");
        }
    }
}
