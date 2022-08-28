package com.zsgs;

public class Hollow_58 {
    public static void main(String[] args) {
       int n=4;
       //Decreasing Star 1 time|| Increasing space 2 times || Decreasing Star 1 time
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //Increasing star 1 time Decreasing Space 2 times Increasing star 1 time
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
