package com.zsgs;

import java.util.Scanner;

public class TablesPrinting_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        System.out.println("Enter your choice");
        System.out.println("1.Subtraction Table\n2.Multiplication Table");
        int choice = sc.nextInt();
        if(choice==1){
            for(int i=num,j=1;j<=10;i++,j++){
                System.out.println(i+" - "+num+" = "+(i-num));
            }
        }else if(choice==2){
            for(int i=1;i<=10;i++){
                System.out.println(num+" * "+i+" = "+(num*i));
            }
        }
    }
}
