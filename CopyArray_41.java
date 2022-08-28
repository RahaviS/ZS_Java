package com.zsgs;

public class CopyArray_41 {
    public static void main(String[] args) {
        int arr1[]={15,89,36,68,47,63,25,91};
        int arr2[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        for(int a:arr2){
            System.out.print(" "+a);
        }
    }
}
