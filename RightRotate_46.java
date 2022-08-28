package com.zsgs;

import java.util.Scanner;

public class RightRotate_46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of times to rotate Right");
        int n = in.nextInt();
        int arr[]={1,2,3,4,5};
        int last,j;
        //Printing Original Array
        System.out.println("Original Array");
        for(int a:arr){
            System.out.print(a+" ");
        }
        for(int i=0;i<n;i++){
            last=arr[arr.length-1];
            for(j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=last;
        }
        System.out.println("\nAfter Rotating Right "+n+" times");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
