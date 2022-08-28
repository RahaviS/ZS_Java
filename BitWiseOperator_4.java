package com.zsgs;

public class BitWiseOperator_4 {
    public static void main(String[] args) {
        int a=10,b=12;
        System.out.println("Bitwise And "+(a&b)); //a = 1 0 1 0 ; b = 1 1 0 0 ; result = 1 0 0 0 =>8
        System.out.println("-----------------------------------------");
        System.out.println("Bitwise OR "+(a|b)); //result = 1 1 1 0 =>14
        System.out.println("-----------------------------------------");
        System.out.println("Bitwise XOR "+(a^b)); //result = 0 1 1 0 =>6
        System.out.println("-----------------------------------------");
        System.out.println("Bitwise Compliment of a "+(~a)); // 1 0 1 0 + 1 => 1 0 1 1 =>-11 (sign bit changed)
        System.out.println("Bitwise Compliment of b "+(~b));
        System.out.println("------------------------------------------");
        System.out.println("Bitwise signed Right Shift "+(14>>2));//This preserves the sign
        System.out.println("Bitwise signed Right Shift "+(-8>>2));
        System.out.println("------------------------------------------");
        System.out.println("Bitwise unsigned Right Shift "+(14>>>2));
        System.out.println("Bitwise unsigned Right Shift "+(-8>>>2));
        System.out.println("------------------------------------------");
        System.out.println("Bitwise Left Shift "+(8<<2));

    }
}
