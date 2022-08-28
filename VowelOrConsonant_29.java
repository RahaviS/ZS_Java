package com.zsgs;

import java.util.Scanner;

public class VowelOrConsonant_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
       // boolean flag = Character.isDigit(c);
       // if(!flag) {
         if(c>='a'&& c<='z'||c>='A'&& c<='Z'){
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    System.out.println(c + " is a Vowel");
                    break;
                default:
                    System.out.println(c + " is a Consonant");
            }
        }else{
            System.out.println(c+" is a Number");
        }

    }
}
