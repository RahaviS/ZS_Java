package com.zsgs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOddPosition_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int length = in.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter array elements");
        //To Store elements in array
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //To Print elements in Odd Position index=0 position=1
        for(int i=0;i<arr.length;i++){
            if(i==0||i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
