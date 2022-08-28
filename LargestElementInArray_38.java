package com.zsgs;

public class LargestElementInArray_38 {
    public static void main(String[] args) {
        int arr[]={25,13,17,38,26,49};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest Element in this array is "+largest);
    }
}
