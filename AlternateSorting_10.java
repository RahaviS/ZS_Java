package com.zsgs;

import java.util.Arrays;

public class AlternateSorting_10 {
    public static void main(String[] args) {
        int arr[]= {2, 3, 1, 4, 5, 6, 7}; //1 2 3 4 5 6 7
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            System.out.print(arr[j--]+" ");
            System.out.print(arr[i++]+" ");
        }
        if (arr.length % 2 != 0)
            System.out.print(arr[i]);
    }
}
