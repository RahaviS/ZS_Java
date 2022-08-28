package com.zsgs;

public class LeftRotate2D_11 {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("No of Rows " + n);
        System.out.println("No of columns " + m);
        if(m != n) {
            System.out.println("Rows and columns should match to perform rotation");
        }
           for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
         System.out.println("Transpose of a Matrix");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
            //RightRotation
//        for(int i=0;i<n;i++){
//            for(int j=0;j<(n/2);j++){
//                int temp = arr[i][j];
//                arr[i][j]=arr[i][n-1-j];
//                arr[i][n-1-j]=temp;
//            }
//        }
//        System.out.println("After Right Rotation");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("");
//        }
        //Left Rotation
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[n-1-i][j];
                arr[n-1-i][j]=temp;
            }
        }
        System.out.println("After Left Rotation");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        }
    }

