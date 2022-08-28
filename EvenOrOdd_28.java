package com.zsgs;

import java.util.Scanner;

public class EvenOrOdd_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=in.nextInt();
        if(num==0){
            System.out.println("neither even nor odd");
        }else if(num%2==0){
            System.out.println("Given Number "+num+" is Even");
        }else{
            System.out.println("Given Number "+num+"  is Odd");
        }
    }
}
