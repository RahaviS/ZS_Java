package com.zsgs;

public class PyramidNumbers_50 {
    public static void main(String[] args) {
        int n=9;
        for(int i=1,p=9;i<=n;i++,p--){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
            }
            System.out.println("");
        }
        //Downward Pattern
        System.out.println("_________________________________");
        for(int i=1,p=9;i<=n;i++,p--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(p+" ");
            }
            System.out.println("");
        }
    }
}
