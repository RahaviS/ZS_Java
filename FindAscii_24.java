package com.zsgs;

import java.util.Scanner;

public class FindAscii_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character");
        char c = in.next().charAt(0);
        int asciiValue= c;
        System.out.println("ASCII Value of Character is : "+asciiValue);
    }
}
