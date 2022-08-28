package com.zsgs;

import java.util.Scanner;

public class SwapNumbers_27 {
    public static void main(String[] args) {
        //Swapping without 3rd variable
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 Numbers to Swap:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Before Swap\nA : "+a+" B : "+b);
        a= a+b;//a=10 b=20 a=30
        b=a-b;
        a=a-b;
        System.out.println("After Swap\nA : "+a+" B : "+b);
    }
}
