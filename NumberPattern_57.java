package com.zsgs;

import java.util.Scanner;

public class NumberPattern_57 {
    public static void main(String[] args) {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number(in odd digits)");
      num=sc.nextInt();
      int len=String.valueOf(num).length();  //parsing int as String to get length
      int arr[]=new int[len];
      for(int i=len-1;i>=0;i--) {
          arr[i] = num % 10;
          num = num / 10;
      }

//      for(int a:arr){
//          System.out.print(a+" ");
//      }
      //Printing Pattern
        System.out.println("\n");
        int n=len;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i||i+j==n+1)
                    System.out.print(arr[j-1]+"");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}


