package com.zsgs;

import java.util.Scanner;

public class DiffOfNumAndReverseNum_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int temp = num;
        int rev=0,total=0;
        while(num>0){
            rev=rev*10+(num%10);
            num=num/10;
        }
        System.out.println("Reverse of a number is "+rev);
        System.out.println("Difference of Number is "+(temp-rev));
    }
}
