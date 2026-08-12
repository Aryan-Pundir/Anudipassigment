package com.anudip.assignment;

import java.util.Scanner;

public class EvenRange {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n;i++){
            if(i%2==0){
                System.out.println("it is a even number " + i);
            }

        }
    }
}
