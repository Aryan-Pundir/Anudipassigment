package com.anudip.assignment;

import java.util.Scanner;

public class AlphabetVowel {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character: ");
        char  ch = sc.next().charAt(0);
        int val = (int) ch;
        if ((ch>='A' && ch<='Z' || ch>='a' && ch<='z') && val>=65 && val<= 122){
            if(val>= 65 && val <=90){
                val = val+32;
                ch = (char) val;
                System.out.println("here is character: " + ch);
                if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    System.out.println("it is a vowel : " + ch);
                }
            }else {
                System.out.println("it is Consonant :" + ch);
            }
        }else {
            System.out.println("it is not a character: error ");
        }
    }
}
