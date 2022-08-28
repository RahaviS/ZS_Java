package com.zsgs;

public class StaticKeyword_8 {
    static int x=10; //common property  //All Static methods can access this without creating an object
    static void method1(){
        int a=++x;
        System.out.println("Value of a : "+a);
    }
    void method2(){ //non static method cannot be accessed directly from a static method. need to create object
       int b=--x; // non static member can access static variable
       System.out.println("Value of b : "+b);
    }
    //static block
    static{System.out.println("This block is called before main");}

    public static void main(String[] args) {
        method1();
        StaticKeyword_8 s=new StaticKeyword_8();
        s.method2();
    }
}
