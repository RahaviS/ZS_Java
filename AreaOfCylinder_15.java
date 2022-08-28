package com.zsgs;

import java.util.Scanner;

public class AreaOfCylinder_15 {
    public static void main(String[] args) {
        final double PI=3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of Cylinder : ");
        double r = in.nextDouble();
        System.out.println("Enter the height of Cylinder : ");
        double h = in.nextDouble();
        double volume = (2*PI*r*h)+(2*PI*r*r);
        System.out.println("Volume of Cylinder : "+volume);
    }
}
