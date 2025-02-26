package org.codetemplates;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str4));

        StringBuffer sb1 = new StringBuffer("Hello");

        StringBuilder sb2 = new StringBuilder("Hello");


    }



}
