package com.zsgs;
public class AlphabetPrinting_53 {
    public static void main(String[] args) {
        String str="a1b10c3d4";
        int n=str.length();
        char[] c = new char[str.length()];
        char temp;
        for (int i= 0; i < n; i++) {
            c[i] = str.charAt(i);
        }
        for(int i=0;i<n;i++){
            int num=0;
             if(c[i]>='0' && c[i]<='9'){
                 temp = c[i-1];
                     while (c[i] >= '0' && c[i] <= '9') {
                         num = (num * 10) + (c[i] - 48);
                         i++;
                         if(i>n-1) break;
                     }
                 for(int j=0;j<num;j++){
                     System.out.print(temp);
                 }
             }
        }
    }
}
