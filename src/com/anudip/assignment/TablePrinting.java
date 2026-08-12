package com.anudip.assignment;

import java.util.Scanner;

public class TablePrinting {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
         int n = sc.nextInt();
         for (int i = 1; i<11; i++ ){
             int table = i*n;
             System.out.println(table);
         }

    }
}
