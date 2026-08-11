package com.anudip.assignment;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int reverse = 0;
        int temp = n;
        while (temp != 0){

            int m = temp%10;
            reverse = reverse*10+ m;
            temp = temp/10;
        }
        System.out.println(reverse);
    }
}
