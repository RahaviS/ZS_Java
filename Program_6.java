package com.zsgs;

import java.util.Scanner;

public class Program_6 {
    static int j=1,b=0; //j is for group_no b is for starting roll no
    static int c; //members per group
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Students");
        int n=sc.nextInt();
        c=n/4;
        int first=101;
        int last=first+(n-1);
        group("Group-"+j ,first+b,first,last);
    }
    static void group(String name, int a,int first,int last){
      while(j<=4&&b<4) {
          System.out.println(name);
          System.out.println(a);
          int i = 1;
          while (i <= (c-1)) {
              if (a >= first && a <=last) {
                  a = a + 4;
                  System.out.println(a);
              }
              i++;
          }
          j++;
          b++;
          group("Group-" + j, first + b, first, last);
      }
    }

}
