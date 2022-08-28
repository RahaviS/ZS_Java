package com.zsgs;

import java.util.Scanner;

public class AlphabetPattern_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Character");
        char letter = sc.next().charAt(0);
        int c = letter;
        int n=(c-64);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(c-64);j++){
                char s = (char) c;
                System.out.print(s);
            }
            c--;
            System.out.println("");
        }
    }
}
