package com.zsgs;

public class NumberPattern_48 {
    public static void main(String[] args) {
        int n=9;
        for(int i=1,k=9;i<=n;i++,k--){
            int p=k;
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                System.out.print(p++ +" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(p-- +" ");
            }
            System.out.println("");
        }
    }
}
