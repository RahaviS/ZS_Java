package com.zsgs;

public class SumOfArrayItems_45 {
    public static void main(String[] args) {
        int arr[]={15,26,94,61,52,39};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Array Elements are "+sum);
    }
}
