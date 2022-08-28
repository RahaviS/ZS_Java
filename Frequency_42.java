package com.zsgs;

public class Frequency_42 {
    public static void main(String[] args) {
        int arr[]={5,5,2,3,8,2,3,5,2,2,4,3};
        int freq[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    freq[j]=-1;
                }
            }
            if(freq[i]!=-1){
                freq[i]=count;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(freq[i]!=-1) {
                System.out.println("Frequency of " + arr[i] + " : " +freq[i]);
            }
        }
    }
}
