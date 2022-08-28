package com.zsgs;

public class SmallestInArray_39 {
    public static void main(String[] args) {
        int arr[]={78,65,14,2,54,19};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element in this array is "+smallest);
        //program_40 No of Elements in an array
        System.out.println("No of Elements in this array is "+arr.length);
    }
}
