package com.zsgs;

import java.util.Scanner;

public class AlphabetOrNot_33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character");
        char c = in.next().charAt(0);
        if(c>='a' && c<='z'|| c>='A' && c<='Z'){
            System.out.println(c+" is an Alphabet");
        }else if(c>='0' && c<='9'){
            System.out.println(c+" is a Number");
        }else{
            System.out.println(c+" is neither a Number nor an Alphabet");
        }
    }
}
