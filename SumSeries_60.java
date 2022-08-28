package com.zsgs;
import java.util.Scanner;
public class SumSeries_60 {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,t=1;
        for(int i=1;i<=n;i++)
        {
          System.out.print(t);
            if (i<n)
              System.out.print(" + ");
            sum=sum+t;
            t=(t*10)+1;
        }
        System.out.println("\nSum of Numbers is "+sum);
    }
}
