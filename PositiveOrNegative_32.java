package com.zsgs;

import java.util.Scanner;

public class PositiveOrNegative_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = in.nextInt();
        if(num>0){
            System.out.println(num+" is a Positive Number");
        }else if(num<0){
            System.out.println(num+" is a Negative Number");
        }else{
            System.out.println("Entered number is Zero");
        }
    }
}
