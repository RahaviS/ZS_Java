package com.zsgs;

import java.util.Scanner;

public class QuotientRemainder_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        System.out.println("Enter a Divisor");
        int div = in.nextInt();
        int quo=0,rem=0;
        quo=num/div;
        rem=num%div;
        System.out.println("Quotient when dividing "+num+" by "+div+" is : "+quo);
        System.out.println("Remainder when dividing "+num+" by "+div+" is : "+rem);

    }
}
