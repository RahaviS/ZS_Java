package com.zsgs;
import java.util.Arrays;
public class OddAscending_54 {
    public static void main(String[] args) {
        int arr[] = {10, 8, 11, 6, 9, 5, 1, 3, 2};
        int n = arr.length;
        Arrays.sort(arr);
        //Manual sort
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }}}
        System.out.println("\nAlternate Sort");
        int a = 0, b = arr.length - 1;
        while (a < b) {
            System.out.print(arr[b--] + " ");
            System.out.print(arr[a++] + " ");
        }
        if (arr.length % 2 != 0)
            System.out.print(arr[a]);
    }
}
//
//System.out.println("\nAscending Sort");
//        for (int a : arr) {
//        System.out.print(a + " ");
//        }