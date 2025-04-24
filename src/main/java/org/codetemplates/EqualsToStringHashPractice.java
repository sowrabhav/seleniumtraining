package org.codetemplates;

public class EqualsToStringHashPractice {
    public static void main(String[] args) {
        EqualsToStringHash Jack = new EqualsToStringHash("Jack", 30, "New York");
        EqualsToStringHash Jack2 = new EqualsToStringHash("Jack", 30, "New York");
        EqualsToStringHash Sparrow = new EqualsToStringHash("Sparrow", 40, "New Jersey");

        System.out.println(Jack.toString());

        System.out.println(Jack.hashCode());
        System.out.println(Jack2.hashCode());
        System.out.println(Sparrow.hashCode());

        System.out.println(Jack.equals(Jack2));

        System.out.println("Ea"=="FB");
        System.out.println("Ea".equals("FB"));
        System.out.println("Ea".hashCode());
        System.out.println("FB".hashCode());


    }
}
