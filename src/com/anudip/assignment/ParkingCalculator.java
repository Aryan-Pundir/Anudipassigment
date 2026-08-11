package com.anudip.assignment;

import java.util.Scanner;

public class ParkingCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your hours");
        double hours = sc.nextDouble();
        if (hours > 0 && hours <= 2  ){
            System.out.println("your charge  is  : 30 ");
        } else if (hours> 2 && hours <= 5) {
            System.out.println("your charge is : 50 ");
        } else if (hours > 5 && hours <= 10) {
            System.out.println("your charge is : 80 ");
        } else if (hours > 10) {
            System.out.println(" your charge is : 120");
        }else {
            System.out.println(" enter valid hours ");
        }
    }
}
