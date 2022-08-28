package com.zsgs;

import java.util.Scanner;

public class AreaOfRectangle_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length : ");
        float length = in.nextFloat();
        System.out.println("Enter Breadth : ");
        float breadth=in.nextFloat();
        System.out.print("Area of Rectangle is : "+length*breadth);
    }
}
