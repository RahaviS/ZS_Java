package com.zsgs;

import java.util.Scanner;

public class SumAndLargest_34 {
    public static void main(String[] args) {
        int n,sum=0,rem=0,largest=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n to print Natural numbers upto n");
        n=in.nextInt();
        int i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum of "+n+" natural numbers is "+sum);
        //To find Largest digit in Sum
        while(sum>0){
            rem=sum%10;
            if(largest<rem){
                largest=rem;
            }
            sum=sum/10;
        }
        System.out.println("Largest digit in Sum is "+largest);
    }
}
