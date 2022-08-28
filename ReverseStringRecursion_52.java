package com.zsgs;

public class ReverseStringRecursion_52 {
    public static void main(String[] args) {
        String str="I Love India and india is my love";
        String s[]=str.split(" ");
        int start=0,end=s.length-1;
        recursion(s,start,end);
        System.out.println("After Reversing");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
    public static void recursion(String s[],int start,int end){
        if(start>=end){
            return;
        }
            String temp;
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            recursion(s,start+1,end-1);
    }

}
