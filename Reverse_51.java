package com.zsgs;

import java.util.Scanner;

public class Reverse_51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int rev=0;
        while(num>0){
          rev=rev*10+(num%10);
          num=num/10;
        }
        System.out.println("Reverse of a number is "+rev);
    }
}
