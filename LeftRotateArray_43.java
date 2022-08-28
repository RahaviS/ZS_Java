package com.zsgs;

import java.util.Scanner;

public class LeftRotateArray_43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of times to Left Rotate");
        int n= in.nextInt();
        int first,j;
        int arr[]={1,2,3,4,5};
        //Printing Original Array
        System.out.println("Original Array");
        for(int a:arr){
            System.out.print(a+" ");
        }
        //Left Rotating
        for(int i=0;i<n;i++){
            first=arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.println("\nArray after left rotation");
        for(int a:arr) {
            System.out.print(a+" ");
        }
    }
}
