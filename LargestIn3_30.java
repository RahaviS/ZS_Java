package com.zsgs;

import java.util.Scanner;

public class LargestIn3_30 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 Nos");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b&&a>c){
            System.out.println("Largest No is "+a);
        }else if(b>c){
            System.out.println("Largest No is "+b);
        }else{
            System.out.println("Largest No is "+c);
        }

    }
}
