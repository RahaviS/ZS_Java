package com.zsgs;

public class Substring_59 {
    public static void main(String args[])
    {
        String s1 = "Rahavi";
        String s2 = "vi";
        int x = s1.length();
        int y = s2.length();
        boolean res=false;
        int i,j;
        for (i = 0; i <= x-y; i++) {
            for (j = 0; j < y; j++)
                if (s1.charAt(i + j) != s2.charAt(j))
                    break;
            if (j == y)
                res = true;
        }
        if (!res)
            System.out.println("Not present -1");
        else
            System.out.println("Present at index " + (i-1));
    }


    //indexof Method
//    public static void main(String args[]) {
//        String s = "String123String";
//        String s1 = "123";
//        int index = s.indexOf(s1);
//        System.out.println(index);
//    }
}
