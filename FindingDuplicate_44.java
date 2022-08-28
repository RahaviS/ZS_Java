package com.zsgs;

public class FindingDuplicate_44 {
    public static void main(String[] args) {
        int arr[]={10,25,12,10,13,25,17,10,13};
        int dup[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    dup[j]=-1;
                }
            }
            if(dup[i]!=-1){
                dup[i]=count;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(dup[i]>1){
                System.out.println("Duplicate Elements are : "+arr[i]+" ");
            }
        }
    }
}
