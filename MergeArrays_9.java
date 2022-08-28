package com.zsgs;

public class MergeArrays_9 {
    public static void main(String[] args) {
        int arr1[]={2,4,5,6,7,9,10,13};
        int arr2[]={2,3,4,5,6,7,8,9,11,15};
        int totalLength=arr1.length+arr2.length;
        int arr3[]=new int[totalLength];
        for(int i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[(arr1.length+i)]=arr2[i];
        }
       //Checking duplicates
        for(int i=0;i<arr3.length;i++){
           // int count=1;
            for(int j=i+1;j<arr3.length;j++){
                if(arr3[i]==arr3[j]){
                    arr3[j]=-1;
                }
            }
        }
        System.out.println("Without Duplicates");
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]!=-1){
              System.out.print(arr3[i]+" ");
            }
        }
        //Sorting
        for(int i=0;i<arr3.length;i++) {
            int temp;
            for (int j = i+1; j < arr3.length-1; j++) {
                if (arr3[i] != -1) {
                    if (arr3[i] > arr3[j]) {
                        temp = arr3[i];
                        arr3[i] = arr3[j];
                        arr3[j] = temp;
                    }
                }
            }
        }
        System.out.println("\nSorted elements");
        for(int t:arr3){
        if (t != -1)
            System.out.print(t+" ");
        }
    }
}
