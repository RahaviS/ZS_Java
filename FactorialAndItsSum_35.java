package com.zsgs;

import java.util.Scanner;

public class FactorialAndItsSum_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num= in.nextInt();
        int factorial = fact(num);
        int sum=0;
        System.out.println("Factorial of given number is "+factorial);
        while(factorial>0){
            int temp=factorial;
            temp=factorial%10;
            factorial=factorial/10;
            sum+=temp;
        }
        System.out.println("Sum of Factorial is "+sum);
    }
    public static int fact(int n){

        while(n>0) {
            return n * fact(n - 1);
        }
        return 1;

    }
}
