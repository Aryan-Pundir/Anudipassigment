package com.anudip.assignment;

import java.util.Scanner;

public class StudentResult {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Subject marks: ");
        float math = sc.nextFloat();
        System.out.println("Enter marks of second subject: ");
        float science = sc.nextFloat();
        System.out.println("Enter marks third subject: ");
        float hindi = sc.nextFloat();
        float totalMarks  = science+math+hindi;
        float percentage = (totalMarks/300)*100;
        if (science >= 40 && math>= 40 && hindi >= 40 ){
        if (percentage>= 90){
            System.out.println("Your grade is: A " );
            System.out.println("your percentage is : " + percentage);
        } else if (percentage>= 75 && percentage <= 89) {
            System.out.println("Your grade is: B " + percentage);
            System.out.println("your percentage is : " + percentage);
        } else if (percentage>= 60 && percentage<= 74) {
            System.out.println("Your garde is: C " + percentage);
            System.out.println("your percentage is : " + percentage);
        } else if (percentage>= 40 && percentage <= 59) {
            System.out.println("Your garde is: D " + percentage);
            System.out.println("your percentage is : " + percentage);
        }
        }else {
            System.out.println("Sorry, you are failed. Try next year.");
        }
    }
}
