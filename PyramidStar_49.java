package com.zsgs;

public class PyramidStar_49 {
    public static void main(String[] args) {
        //same as increasing triangle of stars but with one less space
        int n=9;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            //increasing stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        //Downward Pattern
        System.out.println("__________________________________________");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
