package com.anudip.assignment;

import java.util.Scanner;

public class DiscountRecharge {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter yours amonut:  ");
        int amount = sc.nextInt();
        if (amount > 0 && amount< 200){
            System.out.println("no discount : " + amount);
        } else if (amount >= 200 && amount<= 499) {
            System.out.println(" your discount is : 5% ");
            double discount = amount * 0.05;
            System.out.println("discount amount: " + discount);
            double payableAmount = amount- discount;
            System.out.println("Your final amount: " + payableAmount);
        } else if (amount>499 && amount <= 999) {
            System.out.println(" your discount is : 10% ");
            double discount = amount * 0.10;
            System.out.println("discount amount: " + discount);
            double payableAmount = amount- discount;
            System.out.println("Your final amount: " + payableAmount);
        } else if (amount> 999) {
            System.out.println("your discount is : 15% ");
            double discount = amount * 0.15;
            System.out.println("discount amount: " + discount);
            double payableAmount = amount- discount;
            System.out.println("Your final amount: " + payableAmount);
        }else {
            System.out.println("invalid transactions: ");
        }
    }
}
