package com.zsgs;

public class Programs_18to23 {
    public static void main(String[] args) {
        int a,b,x;
        a=20;
        b=10;
        x=5;
        System.out.println("After doing this operation ++a-b-- "+(++a-b--));
        //System.out.println("After doing this operation a%b++ "+(a%b++));
        //System.out.println("After doing this operation a*=b+5 "+(a*=b+5));
         System.out.println("After doing this operation x=69>>>2 "+(x=69>>>2));
        //program_19
        //a=28;
        //System.out.println(a+=a++ + ++a + --a + a--);
        //program_20
        x = x++ * 2 + 3 * --x;
        System.out.println(x);
        //program_21
        int y=10;
        System.out.println("Z = "+(++y * (y++ + 5)));
        //program_23
        System.out.println("X1 = "+(++x - x++ + --x));
    }
}
