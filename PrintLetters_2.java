package com.zsgs;

import java.util.Scanner;

public class PrintLetters_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character to start printing letters");
        char c = sc.next().charAt(0);
        int s = c;
        for(int i=s;i<=90;i++){
            char x=(char)i;
            System.out.print(x+" ");
        }
        //To print in reverse
        System.out.println("\nPrinting in Reverse");
        for(int i=s;i>=65;i--){
            char t=(char)i;
            System.out.print(t+" ");
        }

    }
}
