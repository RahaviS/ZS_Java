package com.zsgs;

import java.util.Scanner;

public class ConcentricCircles_17 {
    static final double PI=3.14;
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the Radius of Inner Circle");
        double r1 = in.nextDouble();
        System.out.println("Enter the Radius of Outer Circle");
        double r2 = in.nextDouble();
        double area_r1=PI*r1*r1;
        double area_r2=PI*r2*r2;
        System.out.println("Area between the 2 Concentric Circle is "+(area_r2-area_r1));
    }
}
