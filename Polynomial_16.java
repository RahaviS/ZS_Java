package com.zsgs;

public class Polynomial_16 {
    public static void main(String[] args) {
        int[] pol = {3,-2,3};
        int x = 3;
        int n = pol.length;
        int order=n-1;
        int result = pol[0];
        //printing polynomial expression
        System.out.println("Given Polynomial Equation is : ");
        for(int j=0;j<n;j++){
            System.out.print(pol[j]+"x^"+order-- +" ");
        }
        for (int i=1; i<n; i++)
            result = result*x + pol[i];
        System.out.println("\nValue of polynomial is "+result);
    }
}
