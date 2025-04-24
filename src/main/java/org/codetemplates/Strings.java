package org.codetemplates;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str3 == str4);
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));
//        System.out.println(str3.equals(str4));

        String s = "Ea";
        String s1 = "Fb";

        System.out.println(s.hashCode() + " " + s1.hashCode());
//        System.out.println(s1.compareTo(s));
//        System.out.println(s1.equals(s));
//        System.out.println(20==10);


        StringBuffer sb1 = new StringBuffer("Hello ");
        // String buffer is mutable
        // Stringbuffer is synchronized
        // String buffer is thread safe
        sb1.append("USA");


        StringBuilder sb2 = new StringBuilder("Hello");
        // String builder is mutable
        // Stringbuilder is not synchronized
        // String builder is not thread safe

    }

}
