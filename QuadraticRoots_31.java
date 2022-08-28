package com.zsgs;
import java.lang.Math;

public class QuadraticRoots_31 {
    public static void main(String[] args) {
        double a = 2.3, b = 4, c = 5.6;
        double r1,r2,d;
        d= b*b-(4*a*c);
        if(d>0){
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are %.2f %.2f :"+r1+" "+r2);
        }
        else if(d==0){
            r1=r2=-b/(2*a);
            System.out.format("Roots are %.2f %.2f :"+r1+" "+r2);
        }else{
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-d)/(2*a);
            System.out.format("Root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nRoot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
