package com.zsgs;

public class NumberPattern_7 {
    public static void main(String[] args) {
        for(int i=1,p=1;i<=5;i++,p++){
            for(int j=1;j<=5;j++){
                if(i==j||i+j==5+1)
                    System.out.print(p);
                System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }

