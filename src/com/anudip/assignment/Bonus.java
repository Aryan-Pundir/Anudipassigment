package com.anudip.assignment;

import java.util.Scanner;

public class Bonus {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter salary: ");
            int salary = sc.nextInt();
            double bonus = (salary*12.5)/100;
            System.out.println("Bonus "+ bonus);
            double total = salary+ bonus;
            System.out.println("Total earning: " + total);


        }

    }


